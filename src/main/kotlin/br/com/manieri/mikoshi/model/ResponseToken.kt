package br.com.manieri.mikoshi.model

import java.time.LocalDateTime

data class ResponseToken (
    val token : String,
    val timestamp: LocalDateTime = LocalDateTime.now(),
    override val sucess: Boolean = true
) : Response(sucess)