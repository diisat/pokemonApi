package com.pokemonApi.pokemonApi.controller;

import com.pokemonApi.pokemonApi.service.PokemonSoapService;
import com.pokemonApi.pokemonApi.soap.GetPokemonSoapRequest;
import com.pokemonApi.pokemonApi.soap.GetPokemonSoapResponse;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public class PokemonController {
    private PokemonSoapService pokemonSoapService;

    public PokemonController(PokemonSoapService pokemonSoapService) {
        this.pokemonSoapService = pokemonSoapService;
    }

    @WebMethod
    public GetPokemonSoapResponse getPokemonList(@WebParam(name = "request") GetPokemonSoapRequest request) {
        return pokemonSoapService.getPokemonList(request);
    }
}
