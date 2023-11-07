pluginManagement {
    repositories {
        mavenCentral()
        gradlePluginPortal()
    }
}

rootProject.name = "spring-demo"
include("square-app")
include("random-adapter")
include("day-of-month-adapter")
include("number-provider")
