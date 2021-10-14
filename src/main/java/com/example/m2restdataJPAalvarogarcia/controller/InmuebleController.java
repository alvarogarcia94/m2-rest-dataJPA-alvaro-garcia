package com.example.m2restdataJPAalvarogarcia.controller;

import com.example.m2restdataJPAalvarogarcia.entities.Inmueble;
import com.example.m2restdataJPAalvarogarcia.repository.InmuebleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@RestController
public class InmuebleController {

    //1st Way
    //@Autowired

    //2nd way
    InmuebleRepository repository;

    //Builder
    public InmuebleController(InmuebleRepository repository){
        this.repository = repository;
    }

    //Methods
    @GetMapping("/inmuebles")
    public List<Inmueble> findAll(){
        return repository.findAll();
    }

    //Inserción de datos.
    @GetMapping("/insert")
    public void testData(){
        Inmueble casa = new Inmueble(null, 300000d, 200, "Nuñez y Navarro", false);
        Inmueble piso = new Inmueble(null, 140000d, 95, "Tecnocasa", false);
        repository.save(casa);
        repository.save(piso);
    }

    @GetMapping("/insert/{id}")
    public Inmueble findByID(@PathVariable Long id) {
        Optional<Inmueble> inmuebleOpt = repository.findById(id);
        if (inmuebleOpt.isPresent()) {
            return inmuebleOpt.get();
        } else
            return null;
    }

    @GetMapping("/inmuebles/inmobiliaria/{inmobiliaria}")
    public List<Inmueble> findByInmobiliaria(@PathVariable String inmobiliaria){

        return repository.findByInmobiliaria(inmobiliaria);
    }


    /**
     * Crear UN (UNO) (1) inmueble (NO LISTAS !!!!!!!!) en base datos.
     *
     * Ejemplo de JSON para enviar desde POSTMAN:
     {
     "id": null,
     "price": 1500000.0,
     "m2": 450,
     "inmobiliaria": "Tomkinson",
     "garden": true
     }

    //Post
     Aquí el id viene null porque creamos un registro que todavia no existe
     */

    @PostMapping("/inmuebles")
    public void create(@RequestBody Inmueble inmueble) {
        if (inmueble.getId() == null) {
            repository.save(inmueble);
        }

    }

    /**
     * Actualizar UN registro en la base de datos.
     *
     * Aquí el id viene distinto de null porque actualizamos un registro que ya existe.
     */

    @PutMapping("/inmuebles")
    public void update(@RequestBody Inmueble inmueble){
        if (inmueble.getId() != null){
            repository.save(inmueble);
        }

    }

    @DeleteMapping("/inmuebles/{id}")
    public void deleteById(@PathVariable Long id){
        if(repository.existsById(id)){
            repository.deleteById(id);

        }

    }

}