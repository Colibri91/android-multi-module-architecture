pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
    }
}

include(
    ":app",
    ":core")

rootProject.buildFileName = "build.gradle.kts"
include(":feature:home")
