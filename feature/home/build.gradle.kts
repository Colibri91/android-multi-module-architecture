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
        kotlinCompilerExtensionVersion = rootProject.extra["compose_version"] as String
    }
}

dependencies {
    implementation("androidx.core:core-ktx:1.7.0")
    api ("androidx.compose.ui:ui:${rootProject.extra["compose_version"]}")
    api ("androidx.compose.material:material:${rootProject.extra["compose_version"]}")
    api ("androidx.compose.ui:ui-tooling-preview:${rootProject.extra["compose_version"]}")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.3")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.4.0")
    androidTestImplementation("androidx.annotation:annotation:1.4.0")
}