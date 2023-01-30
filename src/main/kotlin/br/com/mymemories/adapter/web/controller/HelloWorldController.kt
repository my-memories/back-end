package br.com.mymemories.adapter.web.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloWorldController {
    @GetMapping
    fun helloWorlrd(): String {
        return "Hello World"
    }
}
