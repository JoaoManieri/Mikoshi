package br.com.manieri.mikoshi

import br.com.manieri.mikoshi.model.ResponseToken
import br.com.manieri.mikoshi.service.JwtService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/auth")
class ControllerAuth(private val jwtService: JwtService) {

    @PostMapping
    fun generateToken(@RequestBody appId: String): ResponseToken {
        println(appId)
        return jwtService.generateToken(appId)
    }
}