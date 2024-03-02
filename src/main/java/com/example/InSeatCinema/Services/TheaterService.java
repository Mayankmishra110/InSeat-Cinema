package com.example.InSeatCinema.Services;

import com.example.InSeatCinema.Entities.TheaterEntity;
import com.example.InSeatCinema.Entities.TheaterSeatEntity;
import com.example.InSeatCinema.EntryDtos.TheaterEntryDto;
import com.example.InSeatCinema.convertors.TheaterConvertors;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TheaterService {

    public String addTheater(TheaterEntryDto theaterEntryDto) {


        TheaterEntity theaterEntity = TheaterConvertors.convertDtoToEntity(theaterEntryDto);


        List<TheaterSeatEntity> theaterSeatEntityList = createTheaterSeats(theaterEntryDto,theaterEntity);

        int noClassicSeats = theaterEntryDto.getClassicSeatsCount();
        int noPremiumSeats = theaterEntryDto.getPremiumSeats.Count();

    }

}
