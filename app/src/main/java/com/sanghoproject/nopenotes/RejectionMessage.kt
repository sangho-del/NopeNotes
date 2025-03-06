package com.sanghoproject.nopenotes

data class RejectionMessage(
    val message: String,
    val situation: String,
    val emotionType: String // "SOFT", "FIRM", "HUMOR"
) 