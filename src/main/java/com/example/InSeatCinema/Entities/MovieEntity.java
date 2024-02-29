package com.example.InSeatCinema.Entities;


import com.example.InSeatCinema.Genres.Genre;
import com.example.InSeatCinema.Genres.Language;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "movies")
@Data
public class MovieEntity {


      @Id
      @GeneratedValue(strategy = GenerationType.IDENTITY)

      private int id;



    @Column(unique = true, nullable = false)
    private String movieName;

    private double ratings;

    private int duration;

    @Enumerated(value = EnumType.STRING)
    private Language language;

    @Enumerated(value = EnumType.STRING)
    private Genre genre;

//   @OneToMany

}
