package com.sh.fame_ko.config

import lombok.extern.slf4j.Slf4j
import mu.KotlinLogging
import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Configuration
import java.net.URI
import java.net.URISyntaxException
import java.sql.Connection
import java.sql.DriverManager
import java.sql.SQLException
import java.sql.Statement
import javax.annotation.PostConstruct

@Configuration
@Slf4j
class DataSourceConfig (
) {
    private val logger = KotlinLogging.logger{}

    @Value("\${spring.datasource.driver-class-name}")
    private val driverClassName : String? = null

    @Value("\${spring.datasource.url}")
    private val dataSourceUrl : String? = null

    @Value("\${spring.datasource.username}")
    private val dataSourceUserName : String? = null

    @Value("\${spring.datasource.password}")
    private val dataSourcePassword : String? = null

    @PostConstruct
    fun init() {
        try{
            Class.forName(driverClassName)
            var uri : URI = URI(dataSourceUrl?.replace("jdbc:","") ?: null)
            var host : String = uri.host
            var port : Int = uri.port
            var path : String = uri.path
            var query : String? = uri.query
            var connectURL : String = "jdbc:postgresql://$host:$port?$query"
            var connection : Connection = DriverManager.getConnection(connectURL, dataSourceUserName, dataSourcePassword)
            var statement : Statement = connection.createStatement()
            var createSQL : String = "CREATE DATABASE IF NOT EXIST '${path.replace("/","")}' DEFAULT CHARACTER SET = 'utf-8' COLLATE 'utf8_general_ci'"
            statement.executeUpdate(createSQL)
            statement.close()
            connection.close()
        } catch (e : URISyntaxException) {
            logger.error(e.message)
        } catch (e : ClassNotFoundException) {
            logger.error(e.message)
        } catch (e : SQLException) {
            logger.error(e.message)
        }
    }
}

