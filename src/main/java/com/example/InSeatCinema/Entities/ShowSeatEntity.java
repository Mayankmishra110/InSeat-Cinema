package com.example.InSeatCinema.Entities;


import com.example.InSeatCinema.Genres.SeatType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name="showcase")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ShowSeatEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;

   private boolean isBooked;

   private int price;

   private String seatNo;


   @Enumerated(value = EnumType.STRING)
   private SeatType seatType;

   private Date bookedAt;

    @ManyToOne
    @JoinColumn

    private ShowEntity showEntity;


}
