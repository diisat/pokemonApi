package com.pokemonApi.pokemonApi.soap;


import com.pokemonApi.pokemonApi.controller.PokemonController;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import javax.xml.ws.Endpoint;

@Configuration
public class SoapConfig {
    @Bean
    public Endpoint endpoint(PokemonController pokemonController) {
        Endpoint endpoint = Endpoint.publish("http://localhost:8080/pokemon", pokemonController);

        return endpoint;
    }
}
