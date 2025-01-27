package com.ciandt.summit.bootcamp2022.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "PlayList")
public class PlayList {
    @Id
    private String id;
    @OneToMany
    @JoinTable(name = "PlayListMusicas", joinColumns = @JoinColumn(name = "PlayListId"), inverseJoinColumns = @JoinColumn(name = "MusicaId"))
    private List<Musica> musica;

    public PlayList(List<Musica> musica) {
        this.musica = musica;
    }

    public PlayList() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Musica> getMusica() {
        return musica;
    }

    public void setMusica(List<Musica> musica) {
        this.musica = musica;
    }
}
