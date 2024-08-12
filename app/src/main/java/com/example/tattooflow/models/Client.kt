package com.example.tattooflow.models

data class Client(
    val id: Int,
    val name: String,
    val contactInfo: String,
    val tattooHistory: String,
    val notes: String,
    val photoPath: String
)