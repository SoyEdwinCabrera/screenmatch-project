package com.project.java.screenmatch;

import com.fasterxml.jackson.annotation.JsonAlias;

public record DatosSerie(

        @JsonAlias("Title") String titulo,

        @JsonAlias("totalSeasons") Integer totalDeTemporadas,

        @JsonAlias("ImdbRating") String evalucion) {
}
