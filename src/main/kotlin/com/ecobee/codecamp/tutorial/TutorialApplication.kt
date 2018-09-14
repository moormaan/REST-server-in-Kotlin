package com.ecobee.codecamp.tutorial

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication


@SpringBootApplication
class TutorialApplication

fun main(args: Array<String>) {
    runApplication<TutorialApplication>(*args)
}
