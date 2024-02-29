package com.example.InSeatCinema.Entities;


import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "theaters")
public class TheaterEntity {

   @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

   private int id;
   private String name;

   private String location;

   @OneToMany(mappedBy = "theaterEntity",cascade = CascadeType.ALL)

    private List<TheaterSeatEntity> theaterSeatEntityList = new ArrayList<>();

}
