package com.pokemonApi.pokemonApi.service;

import com.pokemonApi.pokemonApi.model.Pokemon;
import com.pokemonApi.pokemonApi.soap.GetPokemonSoapRequest;
import com.pokemonApi.pokemonApi.soap.GetPokemonSoapResponse;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PokemonSoapService {

    private PokemonService pokemonService;

    public PokemonSoapService(PokemonService pokemonService){
        this.pokemonService = pokemonService;
    }

    public GetPokemonSoapResponse getPokemonList(GetPokemonSoapRequest request) {

        int limit = request.getLimit();
        int offset = request.getOffset();
        List<Pokemon> pokemonList = pokemonService.getPokemonList(limit, offset);
        GetPokemonSoapResponse response = new GetPokemonSoapResponse();
        response.setPokemonList(pokemonList);

        return response;
    }


}
