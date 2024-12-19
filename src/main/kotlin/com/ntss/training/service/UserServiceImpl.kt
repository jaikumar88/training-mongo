package com.ntss.training.service

import com.ntss.training.model.User
import com.ntss.training.repo.UserRepositoryImpl

class UserServiceImpl(val userRepository: UserRepositoryImpl) : UserService {

    override fun getAllUsers(): List<User> = userRepository.getAllUsers()

    override fun getUserById(id: Int): User? = userRepository.getUserById(id)

    override fun createUser(userName: String, email: String): Int {
        val user = User(name = userName, email = email)
        return userRepository.addUser(user)
    }

    override fun updateUser(id: Int, userName: String, email: String): Boolean {
        val user = User(id = id, name = userName, email = email)
        return userRepository.updateUser(id, user)
    }

    override fun deleteUser(id: Int): Boolean = userRepository.deleteUser(id)
}