package br.com.manieri.mikoshi.service

import br.com.manieri.mikoshi.model.Register
import br.com.manieri.mikoshi.model.Response
import br.com.manieri.mikoshi.model.ResponseRegister
import br.com.manieri.mikoshi.model.ResponseWrong
import br.com.manieri.mikoshi.util.validadeToken
import org.springframework.stereotype.Service

@Service
class ServiceRegister(val passwordService: PasswordService) : AbstractServiceResponse() {

    private var success : Boolean =  false;
    private var senha : String = "!"

    fun registerDevice(register: Register){
        if (validadeToken(register.token)){
            senha = passwordService.registerNewUser(register)
            success = true
        } else {
            success = false
        }
    }

    override fun response(): Response {
        return if (success){
            ResponseRegister(senha, success)
        } else {
            ResponseWrong(0, "Token invalido...", false)
        }
    }

}