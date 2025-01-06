package com.bookmyshow.controllers;


import com.bookmyshow.dtos.SignUpRequestDto;
import com.bookmyshow.dtos.SignUpResponseDto;
import com.bookmyshow.models.User;
import com.bookmyshow.services.UserService;
import org.springframework.stereotype.Controller;
import  com.bookmyshow.dtos.ResponseStatus;

@Controller
public class UserController {
    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    public SignUpResponseDto signUp(SignUpRequestDto requestDto) {
        SignUpResponseDto responseDto = new SignUpResponseDto();

        try {
            User user = userService.signUp(
                    requestDto.getName(),
                    requestDto.getEmail(),
                    requestDto.getPassword()
            );

            responseDto.setResponseStatus(ResponseStatus.SUCCESS);
            responseDto.setUser(user);
        } catch (Exception e) {
            responseDto.setResponseStatus(ResponseStatus.FAILURE);
        }

        return responseDto;
    }
}