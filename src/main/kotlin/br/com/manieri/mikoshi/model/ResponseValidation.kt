package br.com.manieri.mikoshi.model

import java.time.LocalDateTime

data class ResponseValidation(
    val acessoLiberado: Boolean,
    val timestamp: LocalDateTime = LocalDateTime.now(),
    override val sucess: Boolean
) : Response(sucess)