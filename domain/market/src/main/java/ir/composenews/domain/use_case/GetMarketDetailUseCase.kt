@file:Suppress("PackageNaming", "PackageName")

package ir.composenews.domain.use_case

import ir.composenews.domain.model.MarketDetail
import ir.composenews.domain.model.Resource
import ir.composenews.domain.repository.MarketRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetMarketDetailUseCase @Inject constructor(
    private val repository: MarketRepository,
) {

    operator fun invoke(id: String): Flow<Resource<MarketDetail>> = repository.fetchDetail(id = id)
}
