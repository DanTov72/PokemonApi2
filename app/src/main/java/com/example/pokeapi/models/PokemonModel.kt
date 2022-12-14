package com.example.pokeapi.models

import com.example.pokeapi.base.IBaseDiffModel
import com.google.gson.annotations.SerializedName

data class PokemonModel(
    override val id: Int,
    @SerializedName("name")
    val name: String
) : IBaseDiffModel<Int>
