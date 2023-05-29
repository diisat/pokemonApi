package com.pokemonApi.pokemonApi.soap;


import com.pokemonApi.pokemonApi.controller.PokemonController;
import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import javax.xml.ws.Endpoint;
import javax.xml.ws.soap.SOAPBinding;

@Configuration
public class SoapConfig {

    @Autowired
    private Bus bus;
    @Bean
    public Endpoint endpoint(PokemonController pokemonController) {
        Endpoint endpoint = new EndpointImpl(bus, pokemonController, SOAPBinding.SOAP12HTTP_BINDING);
        endpoint.publish("/soap/PokemonSoapService");

       // Endpoint endpoint = Endpoint.publish("http://localhost:8080/services/soap/PokemonSoapService", pokemonController);

        return endpoint;
    }
}
