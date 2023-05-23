package com.pokemonApi.pokemonApi.soap;


import com.pokemonApi.pokemonApi.service.PokemonSoapService;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;


@WebService
public class PokemonSoapEndpoint {

    private PokemonSoapService pokemonSoapService;

    public PokemonSoapEndpoint(PokemonSoapService pokemonSoapService) {

        this.pokemonSoapService = pokemonSoapService;
    }

    @WebMethod
    public GetPokemonSoapResponse getPokemonList(@WebParam(name = "request") GetPokemonSoapRequest request) {
        return pokemonSoapService.getPokemonList(request);
    }
}
