package com.example.InSeatCinema.Services;

import com.example.InSeatCinema.Entities.UserEntity;
import com.example.InSeatCinema.EntryDtos.UserEntryDto;
import com.example.InSeatCinema.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService  {

    @Autowired
   UserRepository userRepository;
   public void addUser(UserEntryDto userEntryDto)


}
