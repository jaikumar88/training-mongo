package com.ntss.training.repo

import com.ntss.training.model.User


interface UserRepository {

    fun getAllUsers(): List<User>
    fun updateUser(id: Int, user: User): Boolean
    fun addUser(user: User): Int
    fun getUserById(id: Int): User?
    fun deleteUser(id: Int): Boolean
}