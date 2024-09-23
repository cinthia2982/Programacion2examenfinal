package com.programacion2examenfinal.modelo

import java.util.*

data class Medicion(
    val id: Int = 0,
    val tipoGasto: String,
    val valor: Double,
    val fecha: Date
)

