package com.ebc.cupcakemaker.staticdata

import androidx.compose.ui.res.stringResource
import com.ebc.cupcakemaker.R

object DataSource {
    val flavors = listOf(
        R.string.vanilla,
        R.string.chocolate,
        R.string.red_velvet,
        R.string.salted_caramel,
        R.string.coffe
    )

    val quantityOptions = listOf(
        Pair(R.string.cupcake_tag, 1),
        Pair(R.string.cupcake_tag, 6),
        Pair(R.string.cupcake_tag, 12)

    )
}