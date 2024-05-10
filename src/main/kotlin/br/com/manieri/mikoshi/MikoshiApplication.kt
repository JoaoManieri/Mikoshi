package br.com.manieri.mikoshi

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MikoshiApplication

fun main(args: Array<String>) {
	runApplication<MikoshiApplication>(*args)
}
