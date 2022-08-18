package com.dolar.multi_module_architecture_sample

import android.app.Application
import com.dolar.core.data.repository.repositoryModule
import com.dolar.core.domain.usecase.useCaseModule
import com.dolar.core.network.networkModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.GlobalContext.startKoin

/**
 * Created by R. Mert Dolar on 22.07.2022.
 */
class MultiModuleApp : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@MultiModuleApp)
            androidLogger()
            modules(
                listOf(networkModule,repositoryModule,useCaseModule)
            )
        }
    }
}