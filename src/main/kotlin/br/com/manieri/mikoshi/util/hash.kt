package br.com.manieri.mikoshi.util

import java.security.MessageDigest

fun getHash(senha: String): String {
    val bytes = senha.toByteArray()
    val digest = MessageDigest.getInstance("SHA-256")
    val hashBytes = digest.digest(bytes)
    return hashBytes.joinToString("") { "%02x".format(it) }
}