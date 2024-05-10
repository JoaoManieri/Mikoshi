package br.com.manieri.mikoshi

import br.com.manieri.mikoshi.model.*
import br.com.manieri.mikoshi.service.ServiceRegister
import br.com.manieri.mikoshi.service.ServiceValidation
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/register")
class ControllerRegister(val serviceRegister: ServiceRegister) {

    @PostMapping()
    fun register(@RequestBody register: Register): Response {
        println(register)
        serviceRegister.registerDevice(register)
        return serviceRegister.response()
    }
}