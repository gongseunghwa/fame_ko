package com.sh.fame_ko.util

import com.fasterxml.jackson.databind.ObjectMapper
import com.sh.fame_ko.exception.NotLoginException
import com.sh.fame_ko.exception.TipException
import com.sh.fame_ko.model.dto.UserDetailsDto
import com.sh.fame_ko.model.entity.User
import com.vladsch.flexmark.html.HtmlRenderer
import com.vladsch.flexmark.parser.Parser
import com.vladsch.flexmark.util.data.MutableDataSet
import org.springframework.security.core.Authentication
import org.springframework.security.core.context.SecurityContextHolder
import org.springframework.util.StringUtils
import java.util.*

class FameUtils  {

    companion object {
        private val OBJECT_MAPPER = ObjectMapper()
        private val MARKDOWN_OPTIONS = MutableDataSet()
        private val PARSER = Parser.builder(MARKDOWN_OPTIONS).build()
        private val HTML_RENDER = HtmlRenderer.builder(MARKDOWN_OPTIONS).build()

        fun getLoginUser() : User? {
            var authentication : Authentication = SecurityContextHolder.getContext().authentication

            if(Objects.isNull(authentication)) throw NotLoginException()

            var principal = authentication.principal
            if(Objects.isNull(principal)) throw NotLoginException()

            return (principal as UserDetailsDto).user

        }

        fun getLoginUserId() : UUID? = getLoginUser()?.id

        fun getJwtHeaderToken() : String? {
            var header : String = getRequest().getHeader(JwtUtil.JWT_HEADER_KEY)

            if(!StringUtils.hasText(header)) {
                return null
            }

            return header.replace(JwtUtil.JWT_HEADER_TOKEN_HEAD_KEY, "").trim()
        }

    }

    constructor() {
        return throw TipException("Constructor not allow")
    }
}