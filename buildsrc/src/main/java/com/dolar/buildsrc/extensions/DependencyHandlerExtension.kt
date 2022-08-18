package com.dolar.buildsrc.extensions

import org.gradle.api.artifacts.Dependency
import org.gradle.api.artifacts.dsl.DependencyHandler
import com.dolar.buildsrc.dependencies.Dependencies
import org.gradle.kotlin.dsl.extra
import org.gradle.kotlin.dsl.project

/**
 * Created by R. Mert Dolar on 17.08.2022.
 */

fun DependencyHandler.releaseImplementation(dependencyNotation: Any): Dependency? =
    add("releaseImplementation", dependencyNotation)

fun DependencyHandler.debugImplementation(dependencyNotation: Any): Dependency? =
    add("debugImplementation", dependencyNotation)

fun DependencyHandler.implementation(dependencyNotation: Any): Dependency? =
    add("implementation", dependencyNotation)

fun DependencyHandler.api(dependencyNotation: Any): Dependency? =
    add("api", dependencyNotation)

fun DependencyHandler.kapt(dependencyNotation: Any): Dependency? =
    add("kapt", dependencyNotation)

fun DependencyHandler.testImplementation(dependencyNotation: Any): Dependency? =
    add("testImplementation", dependencyNotation)

fun DependencyHandler.androidTestImplementation(dependencyNotation: Any): Dependency? =
    add("androidTestImplementation", dependencyNotation)

fun DependencyHandler.ksp(dependencyNotation: Any): Dependency? =
    add("ksp", dependencyNotation)

fun DependencyHandler.implementationAndroidCoreDependencies(){
    implementation(Dependencies.ANDROID_CORE_KTX)
    implementation ("com.google.android.play:core:1.10.3")
}

fun DependencyHandler.implementNetworkDependencies() {
    implementation(Dependencies.RETROFIT)
    implementation(Dependencies.OKHTTP)
    implementation(Dependencies.OKHTTP_LOGGING)
    implementation(Dependencies.MOSHI)
    implementation(Dependencies.MOSHI_ADAPTER)
    implementation(Dependencies.RETROFIT_MOSHI_CONVERTER)
}

fun DependencyHandler.implementComposeDependencies() {
    implementation (Dependencies.COMPOSE_UI)
    implementation (Dependencies.COMPOSE_MATERIAL)
    implementation (Dependencies.COMPOSE_UI_TOOLING)
    implementation (Dependencies.COMPOSE_FOUNDATION)
    androidTestImplementation(Dependencies.COMPOSE_TEST_JUNIT)
}

fun DependencyHandler.implementTestDependencies(){
    testImplementation (Dependencies.JUNIT)
    androidTestImplementation (Dependencies.EXT_JUNIT)
    androidTestImplementation (Dependencies.EXPRESSO_CORE)
    androidTestImplementation(Dependencies.ANNOTATION)

}

fun DependencyHandler.implementModuleDependencies(){
    implementation(project(Dependencies.CORE))
    implementation(project(Dependencies.HOME))
}