package com.programacion2examenfinal.datos

import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.programacion2examenfinal.modelo.Medicion

@Database(entities = [Medicion::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun medicionDao(): MedicionDao
}
