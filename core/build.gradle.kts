import java.io.File
import java.io.FileInputStream
import java.util.*
import com.android.build.gradle.internal.dsl.BuildType
import com.dolar.buildsrc.dependencies.Dependencies
import com.dolar.buildsrc.BuildAndroidConfig

val kotlin_version: String by extra
plugins {
    id(com.dolar.buildsrc.BuildPlugins.ANDROID_LIBRARY)
    id (com.dolar.buildsrc.BuildPlugins.KOTLIN_ANDROID)
}

android {

    compileSdk = BuildAndroidConfig.COMPILE_SDK_VERSION

    val prop = Properties().apply {
        load(FileInputStream(File(rootProject.rootDir, "game.properties")))
    }
    buildTypes.forEach {
        try {
            it.buildConfigStringField("BASE_URL","https://api.rawg.io/api/")
            it.buildConfigStringField("GAME_API_KEY", prop.getProperty("game_api_key"))
        } catch (ignored: Exception) {
            throw InvalidUserDataException("You should create 'game.properties' file in root folder and define in 'game_api_key' key to use api." +
                     "please visit 'https://rawg.io/apidocs'" +
                    "to get key.")
        }
    }
}

dependencies {
    implementation (Dependencies.KOIN)
    implementation (Dependencies.RETROFIT)
    implementation (Dependencies.OKHTTP)
    implementation (Dependencies.OKHTTP_LOGGING)
    implementation(Dependencies.MOSHI)
    implementation(Dependencies.MOSHI_ADAPTER)
    implementation(Dependencies.RETROFIT_MOSHI_CONVERTER)
}

repositories {
    mavenCentral()
}

fun BuildType.buildConfigStringField(name: String, value: String) {
    this.buildConfigField("String", name, "\"$value\"")
}

fun BuildType.buildConfigIntField(name: String, value: Int) {
    this.buildConfigField("int", name, value.toString())
}

fun BuildType.buildConfigBooleanField(name: String, value: Boolean) {
    this.buildConfigField("boolean", name, value.toString())
}