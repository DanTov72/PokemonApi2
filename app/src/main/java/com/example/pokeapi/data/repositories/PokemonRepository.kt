package com.example.pokeapi.data.repositories

import com.example.pokeapi.base.BaseRepository
import com.example.pokeapi.data.remote.apiservices.PokemonApiService
import javax.inject.Inject

class PokemonRepository @Inject constructor(private val service: PokemonApiService) : BaseRepository() {

     fun fetchPokemon() = doRequest {
        service.fetchPokemon()
    }
}