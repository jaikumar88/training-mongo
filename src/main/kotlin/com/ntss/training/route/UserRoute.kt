package com.ntss.training.route

import com.ntss.training.model.User
import com.ntss.training.repo.UserRepositoryImpl
import com.ntss.training.service.UserServiceImpl
import io.ktor.http.HttpStatusCode
import io.ktor.server.request.receive
import io.ktor.server.response.respond
import io.ktor.server.routing.Route
import io.ktor.server.routing.get
import io.ktor.server.routing.post
import io.ktor.server.routing.route


fun Route.userRoute() {

    val userRepository = UserRepositoryImpl()
    val userService: UserServiceImpl = UserServiceImpl(userRepository)

    route("/users") {
        // get all user
        get ("/all"){
            val users = userService.getAllUsers()
            if (users.isEmpty()) {
                call.respond(HttpStatusCode.NoContent, " No users found ")
            } else {
                call.respond(HttpStatusCode.OK, users)
            }

            return@get
        }
        // save user
        post("/create") {
            val user = call.receive<User>()
            val userId = userService.createUser(user.name, user.email)
            if (userId > 0) {
                call.respond(HttpStatusCode.BadRequest, "Unable to save record")
            } else {
                call.respond(HttpStatusCode.OK, "User created successfully: ${userId}")
            }
            return@post
        }

    }

}



