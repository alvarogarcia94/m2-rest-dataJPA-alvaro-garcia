package com.example.m2restdataJPAalvarogarcia.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Inmueble {

    //1. Attributes
    //1.1 Primary key
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //1.2 Data (Fields)
    private Double price;
    private Integer m2;
    private String inmobiliaria;
    private boolean garden;


    //2. Construtores
    public Inmueble(){}

    public Inmueble(Long id, Double price, Integer m2, String inmobiliaria, boolean garden) {
        this.id = id;
        this.price = price;
        this.m2 = m2;
        this.inmobiliaria = inmobiliaria;
        this.garden = garden;
    }

    //3. Getter y Setter

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getM2() {
        return m2;
    }

    public void setM2(Integer m2) {
        this.m2 = m2;
    }

    public String getInmobiliaria() {
        return inmobiliaria;
    }

    public void setInmobiliaria(String inmobiliaria) {
        this.inmobiliaria = inmobiliaria;
    }

    public boolean isGarden() {
        return garden;
    }

    public void setGarden(boolean garden) {
        this.garden = garden;
    }


    //4. ToString

    @Override
    public String toString() {
        return "Inmueble{" +
                "id=" + id +
                ", price=" + price +
                ", m2=" + m2 +
                ", inmobiliaria='" + inmobiliaria + '\'' +
                ", garden=" + garden +
                '}';
    }
}
