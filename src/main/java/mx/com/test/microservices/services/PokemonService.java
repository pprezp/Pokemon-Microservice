package mx.com.test.microservices.services;

import mx.com.test.microservices.models.PokemonModel;
import mx.com.test.microservices.repositories.IPokemonRepository;
import mx.com.test.microservices.vo.ResponseVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PokemonService {

    @Autowired
    IPokemonRepository pokemonRepository;

    public PokemonModel generateResponse(int nationalDex){
        List<PokemonModel> pk = pokemonRepository.getPokemonByNationalNumber( nationalDex );
        return pk.getFirst();
    }
}
