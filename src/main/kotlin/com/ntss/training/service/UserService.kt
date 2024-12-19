package com.ntss.training.service

import com.ntss.training.model.User

interface UserService {
    fun getAllUsers(): List<User>

    fun getUserById(id: Int): User?

    fun createUser(userName: String, email: String): Int

    fun updateUser(id: Int, userName: String, email: String): Boolean

    fun deleteUser(id: Int): Boolean

}