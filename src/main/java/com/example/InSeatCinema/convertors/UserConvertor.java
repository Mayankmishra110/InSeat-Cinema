package com.example.InSeatCinema.convertors;

import com.example.InSeatCinema.Entities.UserEntity;
import com.example.InSeatCinema.EntryDtos.UserEntryDto;

public class UserConvertor {

    //static is kept to avoid calling it via objects/instances
    public static UserEntity convertDtoToEntity(UserEntryDto userEntryDto){

        UserEntity userEntity =  UserEntity.builder().age(userEntryDto.getAge()).address(userEntryDto.getAddress()).email(userEntryDto.getEmail()).name(userEntryDto.getName()).mobNo(userEntryDto.getMobNo()).build();

        return userEntity;
    }
}
