package com.github.alexbogovich.plugin.greeting

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.TaskAction

open class GreetingTask: DefaultTask() {
    @Input
    var who = "mate"

    init {
        group = "greeting"
        description = "Hi bro"
    }

    @TaskAction
    fun greet() {
        println("Hi $who from koltin version of greeting plugin!!!")
    }
}
