package com.pokemonApi.pokemonApi.soap;

public class GetPokemonSoapRequest {

    private int limit;
    private int offset;
    public GetPokemonSoapRequest(int limit,int offset){
        this.limit=limit;
        this.offset=offset;
    }


    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;

    }
}
