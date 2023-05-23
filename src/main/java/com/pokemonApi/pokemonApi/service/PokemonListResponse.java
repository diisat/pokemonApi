package com.pokemonApi.pokemonApi.service;

import com.pokemonApi.pokemonApi.model.Pokemon;

import java.util.List;

public class PokemonListResponse {
    private List<Pokemon> results;

    public List<Pokemon> getResults() {
        return results;
    }

    public void setResults(List<Pokemon> results) {
        this.results = results;
    }
}
