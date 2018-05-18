package com.github.alexbogovich.plugin.greeting

import org.gradle.api.Plugin
import org.gradle.api.Project

class GreetingPlugin implements Plugin<Project> {
    void apply(Project project) {
        project.getTasks().create('greeting', GreetingTask)
    }
}
