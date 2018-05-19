plugins {
    `maven-publish`
    `java-gradle-plugin`
    `kotlin-dsl`
}

group   = "com.github.alexbogovich"
version = "1.0-SNAPSHOT"

repositories {
    jcenter()
}

gradlePlugin {
    (plugins) {
        "greetingPlugin" {
            id = "$group.hello-plugin"
            implementationClass = "$group.plugin.greeting.GreetingPlugin"
        }
    }
}