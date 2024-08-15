package com.example.tattooflow.models

data class Client(
    val id: Long = 0,
    val name: String = "",
    val contactInfo: String = "",
    val tattooHistory: String = "",
    val notes: String = "",
    val photoPath: String? = null
)