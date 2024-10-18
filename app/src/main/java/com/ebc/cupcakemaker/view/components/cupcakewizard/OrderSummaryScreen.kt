package com.ebc.cupcakemaker.view.components.cupcakewizard

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.ebc.cupcakemaker.R
import com.ebc.cupcakemaker.viewmodel.CupcakeMakerViewModel

@Composable
fun OrderSummaryScreen(navContoller: NavController,
                       cupcakeMakerViewModel: CupcakeMakerViewModel) {
    //Text("Order Summary Placeholder")

    //val context = LocalContext.current
    //val resources = context.resources

    Column (
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        Column (
            modifier = Modifier.padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ){
            Text(stringResource(R.string.quantity).uppercase())
            Text(
                text = cupcakeMakerViewModel.state.quantity.toString()  +  "  " + stringResource(R.string.cupcake_tag),
                fontWeight = FontWeight.Bold
            )
            HorizontalDivider(thickness = 1.dp)
        }

    }


}