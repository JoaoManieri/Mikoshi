package br.com.manieri.mikoshi.service

import br.com.manieri.mikoshi.model.Response
import br.com.manieri.mikoshi.model.ResponseValidation
import br.com.manieri.mikoshi.model.Validation
import br.com.manieri.mikoshi.repository.RepositoryData
import org.springframework.stereotype.Service

@Service
class ServiceValidation(val repositoryData: RepositoryData) : AbstractServiceResponse() {

    private var success : Boolean =  false;

    fun validationDevice(validation : Validation) {
        success = repositoryData.validate(validation)
        println(success)
    }

    override fun response(): Response {
        return ResponseValidation(success, sucess = true)
    }

}