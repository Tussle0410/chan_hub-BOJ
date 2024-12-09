package com.chan.hub.boj

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration
import org.springframework.boot.runApplication

@SpringBootApplication(exclude = [DataSourceAutoConfiguration::class])
class BojBeApplication

fun main(args: Array<String>) {
	runApplication<BojBeApplication>(*args)
}
