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
            id = "com.github.alexbogovich.hello-plugin"
            implementationClass = "com.github.alexbogovich.plugin.greeting.GreetingPlugin"
        }
    }
}