package br.com.manieri.mikoshi.model

data class SaveData
    (
    val serialNumber: String,
    val email: String,
    val nome: String,
    val hash: String
) {
    fun getCsv() : String{
        return "${this.nome}, ${this.email}, ${this.serialNumber}, ${this.hash} \n"
    }
}
