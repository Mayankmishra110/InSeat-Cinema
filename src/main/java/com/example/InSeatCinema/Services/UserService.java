package com.example.InSeatCinema.Services;

import com.example.InSeatCinema.Entities.UserEntity;
import com.example.InSeatCinema.EntryDtos.UserEntryDto;
import com.example.InSeatCinema.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public void addUser(UserEntryDto userEntryDto){

//        Creating the objects
    UserEntity userEntity = UserEntity.builder().age(userEntryDto.getAge()).name(userEntryDto.getName()).address(userEntryDto.getAddress()).email(userEntryDto.getEmail()).mobNo(userEntryDto.getMobNo()).build();

    userRepository.save(userEntity);
   //This is to set all the attributes in one go
      }
       UserEntity convertEntryToDto()

  }
