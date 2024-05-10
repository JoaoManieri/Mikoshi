package br.com.manieri.mikoshi.model

data class GenericResponse(
    override val sucess: Boolean =  true,
    val description : String = "Esta é uma resposta generica!"
    ) : Response(sucess)