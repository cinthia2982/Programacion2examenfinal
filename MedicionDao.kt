package com.programacion2examenfinal.datos

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.programacion2examenfinal.modelo.Medicion

@Dao
interface MedicionDao {
    @Insert
    suspend fun insertarMedicion(medicion: Medicion)

    @Query("SELECT * FROM medicion")
    fun obtenerMediciones(): List<Medicion>
}
