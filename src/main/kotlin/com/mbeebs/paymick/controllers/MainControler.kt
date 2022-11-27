package com.mbeebs.paymick.controllers

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class MainController {

    @GetMapping("/")
    fun simplegGet(): String {
        return "works!"
    }
}