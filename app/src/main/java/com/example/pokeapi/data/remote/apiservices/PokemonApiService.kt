package com.example.pokeapi.data.remote.apiservices

import com.example.pokeapi.models.PokemonResponse
import retrofit2.Response
import retrofit2.http.GET

interface PokemonApiService {

    @GET("pokemon")
    suspend fun fetchPokemon() : Response<PokemonResponse>
}