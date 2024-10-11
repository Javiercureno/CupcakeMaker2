package com.ebc.cupcakemaker.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.ebc.cupcakemaker.enumerators.ViewModelIDs
import com.ebc.cupcakemaker.model.CupcakeOrderState


class CupcakeMakerViewModel: ViewModel () {

    //Esta es la variable de estado... va a dar seguimiento a los cambios
    var state by mutableStateOf(CupcakeOrderState())
        private set

    //TODO: Que va a pasar cuando view solicite un cambio
    fun onValue(value:String, textId: String) {
        when (textId) {
            ViewModelIDs.Flavor.id-> state = state.copy(flavor = value);
            "quantity" -> {
                state = state.copy(quantity = value.toInt())
                calculateTotalAmount();
            }
                "price" -> {
                    state = state.copy(price = value.toDouble());
                    calculateTotalAmount();
                }
                "pickupDate" -> state = state.copy(pickupDate = value)
                "extraInstructions" -> state = state.copy(extraInstructions = value)
                "pickupInstructions" -> state = state.copy(pickupInstructions = value)
            }
        }
    /**
     * función para calcular total de la orden
     */
    private fun calculateTotalAmount(){
        val quantity = state.quantity;
        val price = state.price;
        val total = quantity * price;

        state = state.copy(total = total)
    }

    /**
     * función para hacer un reset a la orden e iniciar de nuevo
     */

    fun reset() {
        state = CupcakeOrderState()
    }





}