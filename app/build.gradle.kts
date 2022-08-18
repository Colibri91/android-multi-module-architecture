import com.android.build.api.variant.ApplicationVariant
import com.dolar.buildsrc.dependencies.Dependencies
import com.dolar.buildsrc.extensions.implementComposeDependencies
import com.dolar.buildsrc.extensions.implementModuleDependencies
import com.dolar.buildsrc.BuildAndroidConfig
import java.util.Properties

val kotlin_version: String by extra
plugins {
    id (com.dolar.buildsrc.BuildPlugins.ANDROID_APPLICATION)
    id (com.dolar.buildsrc.BuildPlugins.KOTLIN_ANDROID)
}
apply {
    plugin("kotlin-android")
}

android {
    compileSdk = BuildAndroidConfig.COMPILE_SDK_VERSION

    defaultConfig {
        applicationId = BuildAndroidConfig.APPLICATION_ID
        minSdk = BuildAndroidConfig.MIN_SDK_VERSION
        targetSdk = BuildAndroidConfig.COMPILE_SDK_VERSION
        versionCode = BuildAndroidConfig.VERSION_CODE
        versionName = BuildAndroidConfig.VERSION_NAME

        testInstrumentationRunner = BuildAndroidConfig.TEST_INSTRUMENTATION_RUNNER
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
        kotlinCompilerExtensionVersion = com.dolar.buildsrc.BuildDependenciesVersions.KOTLIN_COMPILER_EXTENSION_VERSION
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
    implementModuleDependencies()
    implementComposeDependencies()
    implementation (Dependencies.ANDROID_CORE_KTX)
    implementation (Dependencies.NAVIGATION)
    implementation (Dependencies.KOIN)
}

repositories {
    mavenCentral()
}