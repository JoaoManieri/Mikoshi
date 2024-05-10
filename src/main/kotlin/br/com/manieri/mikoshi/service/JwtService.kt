package br.com.manieri.mikoshi.service

import br.com.manieri.mikoshi.model.ResponseToken
import io.jsonwebtoken.Claims
import io.jsonwebtoken.Jwts
import io.jsonwebtoken.SignatureAlgorithm
import org.springframework.stereotype.Service
import java.util.Date

@Service
class JwtService {

    private val secretKey = "protecno"

    fun generateToken(appId: String): ResponseToken {
        val token = Jwts.builder()
            .setSubject(appId)
            .setIssuedAt(Date())
            .setExpiration(Date(System.currentTimeMillis() + 86400000)) // Token válido por 1 dia
            .signWith(SignatureAlgorithm.HS256, secretKey)
            .compact()

        return ResponseToken(token)
    }
}
