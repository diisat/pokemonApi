package com.pokemonApi.pokemonApi.soap;

import com.pokemonApi.pokemonApi.model.Pokemon;

import java.util.List;

public class GetPokemonSoapResponse {

    public List<Pokemon> getPokemonList() {
        return pokemonList;
    }

    public void setPokemonList(List<Pokemon> pokemonList) {
        this.pokemonList = pokemonList;
    }

    private List<Pokemon> pokemonList;
}
