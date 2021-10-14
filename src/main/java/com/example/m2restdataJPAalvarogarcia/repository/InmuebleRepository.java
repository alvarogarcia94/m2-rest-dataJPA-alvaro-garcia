package com.example.m2restdataJPAalvarogarcia.repository;

import com.example.m2restdataJPAalvarogarcia.entities.Inmueble;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import javax.persistence.Id;
import java.util.List;

@Repository
public interface InmuebleRepository extends JpaRepository<Inmueble, Long> {

    List<Inmueble> findByInmobiliaria(String inmobiliaria);

}
