package com.ciandt.summit.bootcamp2022.repository;

import com.ciandt.summit.bootcamp2022.entity.Artista;
import com.ciandt.summit.bootcamp2022.entity.Musica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface MusicaRepository extends JpaRepository<Musica, String> {
    List<Musica> findByNomeContainingIgnoreCase(String nome);
    List<Musica> findByArtistas(Artista artista);
    }