package com.github.alexbogovich.plugin.greeting

import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.invoke

open class GreetingPlugin: Plugin<Project> {
    override fun apply(project: Project) {
        project.run {
            tasks {
                "greeting"(GreetingTask::class)
            }
        }
    }
}
