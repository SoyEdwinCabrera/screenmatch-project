package com.project.java.screenmatch;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.project.java.screenmatch.service.ConsumoAPI;
import com.project.java.screenmatch.service.ConvierteDatos;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScreenmatchApplication implements CommandLineRunner {

	public static void main(String[] args) {

		SpringApplication.run(ScreenmatchApplication.class, args);
	}

	@JsonIgnoreProperties(ignoreUnknown = true)
	public void run(String... args) throws Exception {
		var consumoAPI = new ConsumoAPI();
		var json = consumoAPI.obtenerDatos("https://www.omdbapi.com/?t=highlander&apikey=d33d3103");
		System.out.println(json);
		ConvierteDatos conversor = new ConvierteDatos();
		var datos = conversor.obtenerDatos(json, DatosSerie.class);
		System.out.println(datos);
	}
}
