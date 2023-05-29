package com.pokemonApi.pokemonApi.service;

import com.pokemonApi.pokemonApi.model.Pokemon;
import com.pokemonApi.pokemonApi.soap.GetPokemonSoapRequest;
import com.pokemonApi.pokemonApi.soap.GetPokemonSoapResponse;
import org.apache.cxf.annotations.SchemaValidation;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PokemonSoapService {

    private PokemonService pokemonService;

    public PokemonSoapService(PokemonService pokemonService){
        this.pokemonService = pokemonService;
    }

    /**@Override
    public localhost._8080.pokemonsoapservice.schema.GetPokemonSoapResponse getPokemon(localhost._8080.pokemonsoapservice.schema.GetPokemonSoapRequest parameters) {
        int limit = 5;
        int offset = 5;
        List<Pokemon> pokemonList = pokemonService.getPokemonList(limit, offset);
        localhost._8080.pokemonsoapservice.schema.GetPokemonSoapResponse  response = new localhost._8080.pokemonsoapservice.schema.GetPokemonSoapResponse ();
        response.setResult(pokemonList);

        return response;
    }**/

    public GetPokemonSoapResponse getPokemonList(GetPokemonSoapRequest request) {

        int limit = request.getLimit();
        int offset = request.getOffset();
        List<Pokemon> pokemonList = pokemonService.getPokemonList(limit, offset);
        GetPokemonSoapResponse response = new GetPokemonSoapResponse();
        response.setPokemonList(pokemonList);

        return response;
    }



}
