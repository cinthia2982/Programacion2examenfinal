package com.programacion2examenfinal.vista_modelo

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.programacion2examenfinal.datos.MedicionDao
import com.programacion2examenfinal.modelo.Medicion
import kotlinx.coroutines.launch

class MedicionViewModel(private val dao: MedicionDao) : ViewModel() {
    val mediciones = dao.obtenerMediciones()

    fun agregarMedicion(medicion: Medicion) {
        viewModelScope.launch {
            dao.insertarMedicion(medicion)
        }
    }
}
