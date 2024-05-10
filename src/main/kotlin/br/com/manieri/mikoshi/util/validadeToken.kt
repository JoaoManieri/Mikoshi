package br.com.manieri.mikoshi.util

import java.io.File
import java.nio.file.Files
import java.security.KeyFactory
import java.security.PublicKey
import java.security.spec.X509EncodedKeySpec

import java.security.Signature
import java.util.Base64


fun validadeToken(token: String): Boolean {
//    val publicKey = loadPublicKeyFromFile("chave_publica.der")
//
//    val signature = Signature.getInstance("SHA256withRSA")
//    signature.initVerify(publicKey)
//
//    val signedBytes = Base64.getDecoder().decode(token)
//    signature.update(signedBytes)
//
//    return signature.verify(signedBytes)
    return true
}

fun loadPublicKeyFromFile(filePath: String): PublicKey {
    val keyBytes = Files.readAllBytes(File(filePath).toPath())
    val keySpec = X509EncodedKeySpec(keyBytes)
    val keyFactory = KeyFactory.getInstance("RSA")
    return keyFactory.generatePublic(keySpec)
}