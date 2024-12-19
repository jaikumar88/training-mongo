package com.ntss.training.dto

import org.jetbrains.exposed.sql.Table

object UsersTable : Table("app_users") {
    val userId = integer("user_id").autoIncrement()
    val userName = varchar("user_name", 255)
    val email = varchar("email", 255).uniqueIndex()
    override val primaryKey = PrimaryKey(userId)
}
