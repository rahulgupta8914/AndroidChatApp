package com.example.loginappmvvm.data.model


data class Message (
    val id: String,
    val body: String,
    val timestamp: String,
    val authorId: String,
    val currentUserId: String,
    val authorName: String
)