package com.test.controller;

import com.test.entity.Pokemon;
import com.test.services.PokemonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/pokemon")
public class PokemonController {

    @Autowired
    PokemonService pokemonService;

    @GetMapping("")
    public ResponseEntity<Iterable<Pokemon>>getAllPokemon(){
        return new ResponseEntity<Iterable<Pokemon>>(pokemonService.getAllPokemon(),HttpStatus.OK);
    }
}
