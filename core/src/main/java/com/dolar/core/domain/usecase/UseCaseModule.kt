package com.dolar.core.domain.usecase

import com.dolar.core.domain.usecase.game.LoadGameDetailDataUseCase
import com.dolar.core.domain.usecase.game.LoadGameListDataUseCase
import org.koin.core.module.Module
import org.koin.dsl.module

/**
 * Created by R. Mert Dolar on 15.08.2022.
 */
val useCaseModule : Module = module {
    factory { LoadGameListDataUseCase() }
    factory { LoadGameDetailDataUseCase() }
}