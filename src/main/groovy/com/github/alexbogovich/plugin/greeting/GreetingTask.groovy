package com.github.alexbogovich.plugin.greeting

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.TaskAction

class GreetingTask extends DefaultTask {
    @Input
    String who = "mate"

    @TaskAction
    def greet() {
        println "Hi " + who + "!!!"
    }
}
