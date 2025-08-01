package com.project.java.screenmatch;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)

public record DatosEpisodio(

        @JsonAlias("Title") String titulo,

        @JsonAlias("Episode") Integer numeroEpisodio,

        @JsonAlias("imdbRating") String evaluacion,

        @JsonAlias("Released") String fechaDeLanzamiento

) {
}
