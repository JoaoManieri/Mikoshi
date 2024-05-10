package br.com.manieri.mikoshi

import br.com.manieri.mikoshi.model.Response
import br.com.manieri.mikoshi.model.Validation
import br.com.manieri.mikoshi.service.ServiceRegister
import br.com.manieri.mikoshi.service.ServiceValidation
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/validation")
class ControllerValidation(val serviceValidation: ServiceValidation) {

    @PostMapping
    fun verify(@RequestBody validation: Validation): Response {
        serviceValidation.validationDevice(validation)
        return serviceValidation.response()
    }
}