package br.com.mymemories

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MyMemoriesApplication

fun main(args: Array<String>) {
    runApplication<MyMemoriesApplication>(*args)
}
