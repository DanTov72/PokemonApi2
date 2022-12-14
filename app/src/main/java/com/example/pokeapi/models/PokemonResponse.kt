package com.example.pokeapi.models

import com.google.gson.annotations.SerializedName

data class PokemonResponse(
    @SerializedName("count")
    val count: Int,
    @SerializedName("next")
    val next: String,
    @SerializedName("previous")
    val prev: String,
    @SerializedName("results")
    val pokemonModel: List<PokemonModel>
)
