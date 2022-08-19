import com.dolar.buildsrc.extensions.implementComposeDependencies
import com.dolar.buildsrc.dependencies.Dependencies

plugins {
    id(com.dolar.buildsrc.BuildPlugins.ANDROID_LIBRARY)
    id (com.dolar.buildsrc.BuildPlugins.KOTLIN_ANDROID)
}
android {
    compileSdk = 32

    defaultConfig {
        minSdk = 23
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = com.dolar.buildsrc.BuildDependenciesVersions.KOTLIN_COMPILER_EXTENSION_VERSION
    }
}

dependencies {
    implementComposeDependencies()
    implementation(Dependencies.NAVIGATION)
}