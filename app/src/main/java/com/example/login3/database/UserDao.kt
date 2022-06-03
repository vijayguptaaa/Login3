package com.example.login3.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface UserDao {

    @Insert
    suspend fun insertUser(user: User)

    @Query("select * from User_Table where Email =:Email & Password =:Password")
    fun getUser(Email : String, Password : String) : User
}