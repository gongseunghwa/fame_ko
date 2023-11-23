package com.sh.fame_ko.util

import com.fasterxml.jackson.databind.ObjectMapper
import io.jsonwebtoken.Claims
import io.jsonwebtoken.SignatureAlgorithm
import io.jsonwebtoken.security.Keys
import lombok.experimental.UtilityClass
import org.springframework.http.HttpHeaders

@UtilityClass
class JwtUtil {

    val JWT_HEADER_KEY : String? = HttpHeaders.AUTHORIZATION
    val JWT_HEADER_TOKEN_HEAD_KEY = "Bearer"

    private val SUBJECT = Claims.SUBJECT
    private val CREATED = "created"
    private val AUTHORITIES = "authorities"
    private val SECRET_KEY = Keys.secretKeyFor(SignatureAlgorithm.ES512)
    private val TOKEN_EXPIRE_TIME = 60 * 60 * 1000
    private val REFRESH_TOKEN_EXPIRE_TIME = TOKEN_EXPIRE_TIME * 5

    fun generateToken(subject : String, roles : String, additional : Map<String, String>) : String? {
        return generateToken(subject, roles, additional, TOKEN_EXPIRE_TIME)
    }

    fun generateRefreshToken(subject: String, roles: String, additional: Map<String, String>) : String? {
        return generateToken(subject, roles, additional, REFRESH_TOKEN_EXPIRE_TIME)
    }

    private fun generateToken(subject: String, roles: String, additional: Map<String, String>, expireTime : Long) : String? {
        var claims : HashMap<String, Object> = HashMap<String, Object>(3)
        claims.put(SUBJECT, subject)
        claims
    }

}