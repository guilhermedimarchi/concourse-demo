package com.example.concoursedemo.controller

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController

@RestController
class MainController {

    @GetMapping("/")
    @ResponseStatus(HttpStatus.OK)
    fun helloWorld () : String {
        return "Hello World!"
    }

    @GetMapping("/concourse")
    @ResponseStatus(HttpStatus.OK)
    fun helloConcourse () : String {
        return "Hello Concourse!"
    }


}