package br.com.manieri.mikoshi.model

data class ResponseWrong(
    val errorId : Int,
    val errorDescription: String,
    override val sucess: Boolean
) : Response(sucess)