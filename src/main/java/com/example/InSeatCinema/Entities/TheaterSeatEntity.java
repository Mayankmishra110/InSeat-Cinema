package com.example.InSeatCinema.Entities;


import com.example.InSeatCinema.Genres.SeatType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "theater_seats")
@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class TheaterSeatEntity {


   @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;

   @Enumerated(value = EnumType.STRING)
    private SeatType seatType;

    private String seatNo;




    @ManyToOne
    @JoinColumn

    private TheaterEntity theaterEntity;
}
