package com.example.InSeatCinema.Controller;

import com.example.InSeatCinema.EntryDtos.UserEntryDto;
import com.example.InSeatCinema.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserService userService;



    @PostMapping("/add")
    public String addUser(@RequestBody UserEntryDto userEntryDto){


        return "";
    }
}
