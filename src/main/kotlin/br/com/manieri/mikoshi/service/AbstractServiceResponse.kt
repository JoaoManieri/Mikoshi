package br.com.manieri.mikoshi.service

import br.com.manieri.mikoshi.model.GenericResponse
import br.com.manieri.mikoshi.model.Response

abstract class AbstractServiceResponse {

    open fun response(): Response {
        return GenericResponse()
    }

}