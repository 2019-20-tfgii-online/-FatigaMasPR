package com.example.tfg_fatigapr.DAOs

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.example.tfg_fatigapr.clasesDatos.Ejercicio

@Dao
interface DAOEjercicios {
    @Query("SELECT * FROM tbEjercicios")
    fun seleccionarEjercicios():List<Ejercicio>
    @Query("SELECT * FROM tbEjercicios WHERE Nombre_Usuario=:nombreUsuario")
    fun seleccionarEjercicios(nombreUsuario: String):List<Ejercicio>

    @Insert
    fun añadirEjercicio(ejercicio: Ejercicio)

    @Delete
    fun eliminarEjercicio(ejercicio: Ejercicio)

    @Query("SELECT * FROM tbEjercicios WHERE Dia=:dia")
    fun seleccionarEjercicios(dia:String):List<Ejercicio>
    @Query("SELECT * FROM tbEjercicios WHERE Dia=:dia AND Nombre_Usuario=:nombreUsuario")
    fun seleccionarEjercicios(dia:String,nombreUsuario: String):List<Ejercicio>

    @Query("SELECT COUNT(*) FROM tbEjercicios WHERE Dia=:dia")
    fun ejerciciosDia(dia:String):Int
    @Query("SELECT COUNT(*) FROM tbEjercicios WHERE Dia=:dia AND Nombre_Usuario=:nombreUsuario")
    fun ejerciciosDia(dia:String,nombreUsuario: String):Int

}