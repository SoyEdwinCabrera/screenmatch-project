package com.project.java.screenmatch.service;

public interface IConvierteDatos {

    <T> T obtenerDatos(String json, Class<T> clase);
}
