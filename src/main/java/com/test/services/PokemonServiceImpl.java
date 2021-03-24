package com.test.services;

import com.test.PokemonRepository;
import com.test.entity.Pokemon;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class PokemonServiceImpl implements PokemonService {

    @Autowired
    PokemonRepository pokemonRepository;

    @Override
    public Iterable<Pokemon> getAllPokemon() {
        return pokemonRepository.findAll();
    }
}
