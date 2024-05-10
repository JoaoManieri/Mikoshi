package br.com.manieri.mikoshi.model

data class ResponseRegister (
    val uniqueKey : String,
    override val sucess: Boolean
) : Response (sucess)