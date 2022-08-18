pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
    }
}

include(
    ":app",
    ":core",
    ":feature:home")

rootProject.buildFileName = "build.gradle.kts"