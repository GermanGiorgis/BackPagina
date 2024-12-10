package com.proyectoCaristia.Caristia.Controladores;

import com.proyectoCaristia.Caristia.Entidades.Cliente;
import com.proyectoCaristia.Caristia.Servicios.ClienteServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cliente")
@CrossOrigin("*")
public class ClienteControlador {

    @Autowired
    ClienteServicio clienteServicio;

    @PostMapping
    public Cliente persistir(@RequestBody Cliente request){
        Cliente clienteToSave = request;

        Cliente ClienteGuardado = clienteServicio.crear(clienteToSave);
        return ClienteGuardado;
    }

}
