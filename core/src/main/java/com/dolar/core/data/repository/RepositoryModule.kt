package com.dolar.core.data.repository

import org.koin.core.module.Module
import org.koin.dsl.module

/**
 * Created by R. Mert Dolar on 15.08.2022.
 */
val repositoryModule : Module = module {
    factory { GameRepository() }
}