package com.example.androidregistrationformapp

import java.io.Serializable

data class User(
    val title: String,
    val firstName: String,
    val lastName: String,
    val Email: String,
    val phone: String,
    val password: String
) : Serializable
