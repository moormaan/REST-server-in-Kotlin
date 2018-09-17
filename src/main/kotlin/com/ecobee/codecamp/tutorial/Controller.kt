package com.ecobee.codecamp.tutorial

import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping

@RestController
@RequestMapping(path = ["/v1"])
private class Controller {

    @GetMapping("/greeting")
    fun restGetGreeting() = "Hello\n"

}
