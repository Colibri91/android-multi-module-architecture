package com.dolar.buildsrc.dependencies

import com.dolar.buildsrc.BuildDependenciesVersions

object Dependencies {
    const val KOIN = "io.insert-koin:koin-androidx-compose:${BuildDependenciesVersions.KOIN}"
    const val RETROFIT = "com.squareup.retrofit2:retrofit:${BuildDependenciesVersions.RETROFIT}"
    const val OKHTTP = "com.squareup.okhttp3:okhttp:${BuildDependenciesVersions.OKHTTP}"
    const val OKHTTP_LOGGING = "com.squareup.okhttp3:logging-interceptor:${BuildDependenciesVersions.OKHTTP_LOGGING}"
    const val MOSHI = "com.squareup.moshi:moshi:${BuildDependenciesVersions.MOSHI}"
    const val MOSHI_ADAPTER = "com.squareup.moshi:moshi-adapters:${BuildDependenciesVersions.MOSHI}"
    const val RETROFIT_MOSHI_CONVERTER = "com.squareup.retrofit2:converter-moshi:${BuildDependenciesVersions.RETROFIT_MOSHI_CONVERTER}"
}