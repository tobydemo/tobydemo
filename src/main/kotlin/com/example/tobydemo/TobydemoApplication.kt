package com.example.tobydemo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
@RestController
class TobydemoApplication {
    @GetMapping("/hello")
    fun hello() = "Hello"
}

fun main(args: Array<String>) {
    runApplication<TobydemoApplication>(*args)
}
