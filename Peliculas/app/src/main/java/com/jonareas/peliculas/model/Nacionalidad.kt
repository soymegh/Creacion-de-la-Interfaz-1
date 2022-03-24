package com.jonareas.peliculas.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class Nacionalidad(
    @SerializedName(value = "idNacionalidad")
     val id: Int,
    @SerializedName(value = "nombre")
     val nombre: String,
    @SerializedName(value = "activo")
     val activo: Boolean
) : Serializable