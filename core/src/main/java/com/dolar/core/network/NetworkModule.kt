package com.dolar.core.network

import com.dolar.core.BuildConfig
import com.squareup.moshi.Moshi
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import org.koin.core.module.Module
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import java.util.concurrent.TimeUnit

/**
 * Created by R. Mert Dolar on 22.07.2022.
 */

val networkModule : Module = module {
    single { createOkHttpClient() }
    single { createRetrofit(get(),get())}
    //factory { createWebService<ApiFactory>(get()) }
}

fun createOkHttpClient(): OkHttpClient {
    return OkHttpClient.Builder()
        .connectTimeout(60L, TimeUnit.SECONDS)
        .readTimeout(60L, TimeUnit.SECONDS)
        .addInterceptor(createHttpLoggingInterceptor(BuildConfig.DEBUG))
        .build()
}

private fun createHttpLoggingInterceptor(debugMode : Boolean) : HttpLoggingInterceptor {
    val httpLoggingInterceptor = HttpLoggingInterceptor()
    if(debugMode) httpLoggingInterceptor.level = HttpLoggingInterceptor.Level.BODY
    else httpLoggingInterceptor.level = HttpLoggingInterceptor.Level.NONE
    return httpLoggingInterceptor
}

fun createRetrofit(okHttpClient: OkHttpClient,moshi: Moshi) : Retrofit {
    return Retrofit.Builder()
        .baseUrl(BuildConfig.BASE_URL)
        .client(okHttpClient)
        .addConverterFactory(MoshiConverterFactory.create(moshi)).build()
}

inline fun <reified T> createWebService(retrofit: Retrofit): T {
    return retrofit.create(T::class.java)
}