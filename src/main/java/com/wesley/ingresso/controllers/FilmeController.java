package com.wesley.ingresso.controllers;

import com.wesley.ingresso.models.Filme;
import com.wesley.ingresso.repository.FilmeRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping(value = "/filmes")
public class FilmeController {

    @Autowired
    private FilmeRespository filmeRespository;

    @GetMapping
    public List<Filme> list() {
        return filmeRespository.findAll();
    }

    @PostMapping
    public Filme save(@RequestBody Filme filme) {
        return filmeRespository.save(filme);
    }

}
