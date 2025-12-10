package com.example.myapplication

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "users")
data class UserEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,

    val username : String,
    val email : String,

    @ColumnInfo(name = "firstname")
    val namaDepan : String,

    @ColumnInfo(name = "lastname")
    val namaBelakang : String,

    val password : String
)