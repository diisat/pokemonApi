package com.pokemonApi.pokemonApi.service;

import com.pokemonApi.pokemonApi.model.Pokemon;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class PokemonService {

    private static final String BASE_URL = "https://pokeapi.co/api/v2/pokemon";

    public List<Pokemon> getPokemonList(int limit, int offset) {
        String apiUrl = BASE_URL + "?limit=" + limit + "&offset=" + offset;

        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<PokemonListResponse> responseEntity = restTemplate.getForEntity(apiUrl, PokemonListResponse.class);
        PokemonListResponse response = responseEntity.getBody();

        return response.getResults();
    }
}
