package com.dolar.core.domain.domainmodel.gamelist

import com.dolar.core.data.dtomodel.response.gamelist.Result

/**
 * Created by R. Mert Dolar on 15.08.2022.
 */
data class GameListDomain(val count: Int?,
                          val next: String?,
                          val previous: String?,
                          val results: List<Result>?)
