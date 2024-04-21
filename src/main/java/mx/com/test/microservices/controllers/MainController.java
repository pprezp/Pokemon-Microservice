package mx.com.test.microservices.controllers;

import mx.com.test.microservices.models.PokemonModel;
import mx.com.test.microservices.services.PokemonService;
import mx.com.test.microservices.vo.ResponseVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/pokemon")
public class MainController {

    @Autowired
    PokemonService pokemonService;

    @GetMapping("/nationalDex/{nationalDex}")
    public ResponseEntity<PokemonModel> getTest(@PathVariable int nationalDex ){
        PokemonModel pokemonModel = pokemonService.generateResponse(nationalDex);
        return new ResponseEntity<PokemonModel>( pokemonModel,HttpStatus.ACCEPTED);
    }

}
