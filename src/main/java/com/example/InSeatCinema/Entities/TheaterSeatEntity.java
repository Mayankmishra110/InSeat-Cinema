package com.example.InSeatCinema.Entities;


import com.example.InSeatCinema.Genres.SeatType;
import jakarta.persistence.*;

@Entity
@Table(name = "theater_seats")
public class TheaterSeatEntity {


   @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;

    private SeatType seatType;

    private String seatNo;



    @ManyToOne
    @JoinColumn

    private TheaterEntity theaterEntity;
}
