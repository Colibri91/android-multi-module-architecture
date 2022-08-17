package com.dolar.buildsrc

/**
 * Created by R. Mert Dolar on 27.07.2022.
 */
object BuildAndroidConfig {
    const val APPLICATION_ID = "com.dolar.multi_module_architecture_sample"

    const val BUILD_TOOLS_VERSION = "29.0.2"
    const val COMPILE_SDK_VERSION = 32

    const val VERSION_CODE = 1
    const val VERSION_NAME = "1.0"

    const val TEST_INSTRUMENTATION_RUNNER = "androidx.test.runner.AndroidJUnitRunner"
    val TEST_INSTRUMENTATION_RUNNER_ARGUMENTS = mapOf(
        "leakcanary.FailTestOnLeakRunListener" to "listener"
    )
}