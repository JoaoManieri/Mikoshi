package br.com.manieri.mikoshi.service

import br.com.manieri.mikoshi.model.Register
import br.com.manieri.mikoshi.model.SaveData
import br.com.manieri.mikoshi.repository.RepositoryData
import br.com.manieri.mikoshi.util.getHash
import org.springframework.stereotype.Service
import java.security.MessageDigest

@Service
class PasswordService(val repositoryData: RepositoryData) {

    private fun generateRandonPassword(size: Int = 15): String {
        val caracteres = ('a'..'z') + ('A'..'Z') + ('0'..'9')
        return List(size) { caracteres.random() }.joinToString("")
    }

    fun registerNewUser(register: Register) : String {
        val senha = generateRandonPassword(10)
        val hash = getHash(senha)
        val saveData = SaveData(register.serialNumber,register.email,register.nome, hash)
        repositoryData.setData(saveData)
        return senha
    }
}