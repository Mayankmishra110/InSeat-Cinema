package com.example.InSeatCinema.EntryDtos;

import com.example.InSeatCinema.Genres.ShowType;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
public class ShowEntryDto {

   private LocalDate localDate;
    private LocalTime localTime;
   private ShowType showType;

   private int movieId;

   private int theaterId;

   private int classicSeatPrice;

   private int premiumSeatPrice;





}
