package com.devday.pokemon.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Pokemon {

    @Id
    @GeneratedValue
    private int id;

    private String url;

    private String name;

    public Pokemon() {
    }

    public Pokemon(int id, String url, String name) {
        this.id = id;
        this.url = url;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.name = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}