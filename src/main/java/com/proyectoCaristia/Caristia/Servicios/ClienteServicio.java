package com.proyectoCaristia.Caristia.Servicios;

import com.proyectoCaristia.Caristia.Entidades.Cliente;
import com.proyectoCaristia.Caristia.Repositorios.CLienteRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteServicio {

    //INYECCION DE DEPENDENCIAS DEL REPOSITORIO
    @Autowired
    private CLienteRepositorio clienteRepositorio;

    public Cliente crear(Cliente solicitud){
        Cliente clienteToSave = solicitud;

        //Logca personmalizada aqui

        Cliente clienteSaved = clienteRepositorio.save(clienteToSave);

        return clienteSaved;
    }
}
