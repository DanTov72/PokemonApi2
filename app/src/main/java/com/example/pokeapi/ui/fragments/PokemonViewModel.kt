package com.example.pokeapi.ui.fragments

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.pokeapi.base.BaseViewModel
import com.example.pokeapi.common.Resource
import com.example.pokeapi.data.repositories.PokemonRepository
import com.example.pokeapi.models.PokemonResponse
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class PokemonViewModel @Inject constructor(private val repository: PokemonRepository): BaseViewModel() {

    private val pokemonList = MutableLiveData<Resource<PokemonResponse>>()
    val pokemonState: LiveData<Resource<PokemonResponse>> = pokemonList

    fun fetchPokemon() = repository.fetchPokemon().collectRequest(pokemonList)

}