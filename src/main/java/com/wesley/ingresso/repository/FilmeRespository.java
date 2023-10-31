package com.wesley.ingresso.repository;

import com.wesley.ingresso.models.Filme;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FilmeRespository extends JpaRepository<Filme, Long> {
}
