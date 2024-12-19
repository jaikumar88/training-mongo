package com.ntss.training.repo

import com.ntss.training.dto.UsersTable
import com.ntss.training.model.User


import org.jetbrains.exposed.sql.ResultRow
import org.jetbrains.exposed.sql.insert
import org.jetbrains.exposed.sql.selectAll
import org.jetbrains.exposed.sql.transactions.transaction
import org.jetbrains.exposed.sql.SqlExpressionBuilder.eq
import org.jetbrains.exposed.sql.deleteWhere
import org.jetbrains.exposed.sql.update


class UserRepositoryImpl: UserRepository {



    override  fun getAllUsers(): List<User> = transaction {
            UsersTable.selectAll().map {
                it.toUser()
            }
        }

    override  fun getUserById(id: Int): User? = transaction {
            UsersTable.select (UsersTable.userId eq id ).map {
                    it.toUser()
                }.singleOrNull()
        }

    private fun ResultRow.toUser() = User(
            id = this[UsersTable.userId],
            name = this[UsersTable.userName],
            email = this[UsersTable.email]
        )

    override  fun addUser(user: User): Int = transaction {
            UsersTable.insert {
                it[userName] = user.name
                it[email] = user.email
            } [UsersTable.userId]
        }


    override   fun updateUser(id: Int, user: User): Boolean = transaction {
            UsersTable.update ({UsersTable.userId eq id }) {
                it[userName] = user.name
                it[email] = user.email
            } > 0
        }

     override   fun deleteUser(userId: Int): Boolean = transaction {
            UsersTable.deleteWhere() { UsersTable.userId eq userId } > 0
        }


}