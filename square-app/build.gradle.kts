plugins {
    kotlin("jvm") version "1.8.22"
    id("application")
}

group = "com.example"
version = "0.0.1-SNAPSHOT"

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(17))
    }
}

application {
    mainClass = "squareapp.SquareApplicationKt"
}

repositories {
    mavenCentral()
}

dependencies {
//    implementation(project(":random-adapter"))
//    implementation(project(":day-of-month-adapter"))
}
