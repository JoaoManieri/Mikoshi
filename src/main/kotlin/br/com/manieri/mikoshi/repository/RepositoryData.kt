package br.com.manieri.mikoshi.repository

import br.com.manieri.mikoshi.model.SaveData
import br.com.manieri.mikoshi.model.Validation
import br.com.manieri.mikoshi.util.getHash
import org.springframework.stereotype.Repository
import java.io.File

@Repository
class RepositoryData {

    fun setData(data : SaveData){
        File("dados.csv").appendText(data.getCsv())
    }

    fun validate(validade : Validation) : Boolean {
        val hashes = mutableListOf<String>()
        val csvLeitura = File("dados.csv")

        csvLeitura.forEachLine { linha ->
            val colunas = linha.split(",")
            if (colunas.size >= 2) {
                hashes.add(colunas[3].trim())
            }
        }

        val senhaHash = getHash(validade.senha)
        println(senhaHash)
        return senhaHash in hashes
    }

}