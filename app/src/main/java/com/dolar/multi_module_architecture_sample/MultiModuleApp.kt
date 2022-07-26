package com.dolar.multi_module_architecture_sample

import com.dolar.core.network.networkModule
import com.google.android.play.core.splitcompat.SplitCompatApplication
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.GlobalContext.startKoin

/**
 * Created by R. Mert Dolar on 22.07.2022.
 */
class MultiModuleApp : SplitCompatApplication() {



    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@MultiModuleApp)
            androidLogger()
            modules(
                listOf(networkModule)
            )
        }
    }
}