package com.sh.fame_ko

import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import com.sh.fame_ko.util.ErrorCode
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class App

fun main(args: Array<String>) {
	runApplication<App>(*args)
}
fun test() {
}
