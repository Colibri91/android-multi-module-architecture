package com.dolar.buildsrc.dependencies

import com.dolar.buildsrc.BuildDependenciesVersions

object Dependencies {
    const val KOIN = "io.insert-koin:koin-androidx-compose:${BuildDependenciesVersions.KOIN}"
    const val ANDROID_CORE_KTX = "androidx.core:core-ktx:${BuildDependenciesVersions.ANDROID_CORE_KTX}"
    const val PLAY_CORE = "com.google.android.play:core:${BuildDependenciesVersions.PLAY_CORE}"
    const val RETROFIT = "com.squareup.retrofit2:retrofit:${BuildDependenciesVersions.RETROFIT}"
    const val OKHTTP = "com.squareup.okhttp3:okhttp:${BuildDependenciesVersions.OKHTTP}"
    const val OKHTTP_LOGGING = "com.squareup.okhttp3:logging-interceptor:${BuildDependenciesVersions.OKHTTP_LOGGING}"
    const val MOSHI = "com.squareup.moshi:moshi:${BuildDependenciesVersions.MOSHI}"
    const val MOSHI_ADAPTER = "com.squareup.moshi:moshi-adapters:${BuildDependenciesVersions.MOSHI}"
    const val RETROFIT_MOSHI_CONVERTER = "com.squareup.retrofit2:converter-moshi:${BuildDependenciesVersions.RETROFIT_MOSHI_CONVERTER}"
    const val COMPOSE_UI = "androidx.compose.ui:ui:${BuildDependenciesVersions.COMPOSE}"
    const val COMPOSE_MATERIAL = "androidx.compose.material:material:${BuildDependenciesVersions.COMPOSE}"
    const val COMPOSE_UI_TOOLING = "androidx.compose.ui:ui-tooling:${BuildDependenciesVersions.COMPOSE}"
    const val COMPOSE_FOUNDATION = "androidx.compose.foundation:foundation:${BuildDependenciesVersions.COMPOSE}"
    const val COMPOSE_TEST_JUNIT = "androidx.compose.ui:ui-test-junit4:${BuildDependenciesVersions.COMPOSE}"
    const val LIFECYCLE_KTX = "androidx.lifecycle:lifecycle-runtime-ktx:${BuildDependenciesVersions.LIFECYCLE_KTX}"
    const val NAVIGATION = "androidx.navigation:navigation-compose:${BuildDependenciesVersions.NAVIGATION}"

    //Test
    const val JUNIT = "junit:junit:${BuildDependenciesVersions.JUNIT}"
    const val EXT_JUNIT = "androidx.test.ext:junit:${BuildDependenciesVersions.EXT_JUNIT}"
    const val EXPRESSO_CORE = "androidx.test.espresso:espresso-core:${BuildDependenciesVersions.EXPRESSO_CORE}"
    const val ANNOTATION = "androidx.annotation:annotation:${BuildDependenciesVersions.ANNOTATION}"

    //Modules
    const val CORE = ":core"
    const val HOME = ":feature:home"

}