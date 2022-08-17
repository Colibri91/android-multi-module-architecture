import com.android.build.api.variant.ApplicationVariant
import java.util.Properties
import com.dolar.buildsrc.dependencies.Dependencies

val kotlin_version: String by extra
plugins {
    id ("com.android.application")
    id ("org.jetbrains.kotlin.android")
}
apply {
    plugin("kotlin-android")
}

android {
    compileSdk = 32

    defaultConfig {
        applicationId = "com.dolar.multi_module_architecture_sample"
        minSdk = 23
        targetSdk = 32
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        debug{
        }
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_11.toString()
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = rootProject.extra["compose_version"] as String
    }
    packagingOptions {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }

    androidComponents {
        fun ApplicationVariant.stringBuildConfigField(
            name: String,
            value: String,
            comment: String? = null
        ) {
            val normalizedValue = value.takeIf { it.startsWith("\"") } ?: "\"$value\""
            buildConfigFields.put(
                name,
                com.android.build.api.variant.BuildConfigField("String", normalizedValue, comment)
            )
        }

        fun ApplicationVariant.loadPropertiesIntoBuildConfig(fileName: String) {
            val requiredProperties = listOf(
                "game_api_key"
            )

            val properties = File(rootDir, fileName)
                .inputStream()
                .use {
                    Properties().apply { load(it) }
                }

            requiredProperties.map { key ->
                key to (properties.getProperty(key) ?: throw error("Required build property not found: $key"))
            }.forEach { (propertyName, propertyValue) ->
                stringBuildConfigField(propertyName, propertyValue as String, "Field from property file: $fileName")
            }
        }

        onVariants { variant ->
            variant.loadPropertiesIntoBuildConfig("game.properties")
        }

    }

}

dependencies {
    implementation(project(":core"))
    implementation(project(":feature:home"))

    implementation (Dependencies.ANDROID_CORE_KTX)
    implementation ("androidx.activity:activity-compose:1.5.0")
    implementation (com.dolar.buildsrc.dependencies.Dependencies.NAVIGATION)
    testImplementation ("junit:junit:4.13.2")
    androidTestImplementation ("androidx.test.ext:junit:1.1.3")
    androidTestImplementation ("androidx.test.espresso:espresso-core:3.4.0")
    androidTestImplementation ("androidx.compose.ui:ui-test-junit4:${rootProject.extra["compose_version"]}")
    debugImplementation ("androidx.compose.ui:ui-tooling:${rootProject.extra["compose_version"]}")
    debugImplementation ("androidx.compose.ui:ui-test-manifest:${rootProject.extra["compose_version"]}")
    implementation("androidx.core:core-ktx:1.8.0")
    implementation ("com.google.android.play:core:1.10.3")
    implementation ("io.insert-koin:koin-androidx-compose:3.2.0")

}
repositories {
    mavenCentral()
}