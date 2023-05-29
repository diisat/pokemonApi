package com.pokemonApi.pokemonApi;

import com.pokemonApi.pokemonApi.controller.PokemonController;
import com.pokemonApi.pokemonApi.model.Pokemon;
import com.pokemonApi.pokemonApi.service.PokemonService;
import com.pokemonApi.pokemonApi.service.PokemonSoapService;
import com.pokemonApi.pokemonApi.soap.GetPokemonSoapRequest;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.xml.ws.Endpoint;
import java.util.List;

@SpringBootApplication
public class PokemonApiApplication {

	public static void main(String[] args) {

		SpringApplication.run(PokemonApiApplication.class, args);

		/**PokemonService pokemonService = new PokemonService();
		PokemonSoapService pokemonSoapService = new PokemonSoapService(pokemonService);
		PokemonController pokemonController = new PokemonController(pokemonSoapService);

		/////////Validation for consuming pokemon api
		List<Pokemon> pokemonList= pokemonController.getPokemonList(new GetPokemonSoapRequest(5,5)).getPokemonList();
		for (Pokemon p : pokemonList) {
			System.out.println("name:"+p.getName() + " ---- url:"+p.getUrl());
		}

		/////////Validation for soap exposure
		//String url = "http://localhost:8080/pokemon";
		//Endpoint.publish(url, pokemonController);

		//System.out.println("The soap Pokemon service is exposed in: " + url);**/

	}

}
