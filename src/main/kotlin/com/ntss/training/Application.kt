package com.ntss.training

import com.mongodb.client.MongoClient
import com.ntss.training.connectToMongoDB
import com.ntss.training.route.rootRoutes
import io.ktor.server.application.*
import io.ktor.server.routing.routing

fun main(args: Array<String>) {
    io.ktor.server.netty.EngineMain.main(args)
}



fun Application.module() {
    configureHTTP()
    configureSecurity()
    configureSerialization()
    configureDatabases()
    configureRouting()

    routing {
        rootRoutes()
    }



}


