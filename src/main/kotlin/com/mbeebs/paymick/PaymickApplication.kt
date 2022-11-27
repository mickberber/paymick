package com.mbeebs.paymick

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class PaymickApplication

fun main(args: Array<String>) {
	runApplication<PaymickApplication>(*args)
}
