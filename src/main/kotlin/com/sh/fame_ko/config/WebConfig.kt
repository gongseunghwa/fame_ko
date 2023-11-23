package com.sh.fame_ko.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer

@Configuration
class WebConfig {

    @Bean
    public fun webMvcConfigurer() : WebMvcConfigurer? {
        return object : WebMvcConfigurer {
            override fun addResourceHandlers(registry: ResourceHandlerRegistry) {
                val mediaResource: String? = null
//                    FILE_PROTOCOL + FameConst.USER_HOME + FameConst.FAME_HOME + FameConst.MEDIA_DIR
//                WebConfig.log.info("MediaResource:{}", mediaResource)
//                registry.addResourceHandler(WebConfig.MEDIA_PATH_PATTERNS)
//                    .addResourceLocations(mediaResource)
            }
        }

    }

    companion object {
        const val FILE_PROTOCOL = "file:///"
        const val MEDIA_PATH_PATTERN = "/media/**"
    }
}