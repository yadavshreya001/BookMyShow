package com.bookmyshow.controllers;

import com.bookmyshow.dtos.CreateBookingRequestDto;
import com.bookmyshow.dtos.CreateBookingResponseDto;
import com.bookmyshow.dtos.ResponseStatus;
import com.bookmyshow.models.Booking;
import com.bookmyshow.services.BookingService;
import org.springframework.stereotype.Controller;



@Controller
public class BookingController {
    private BookingService bookingService;

    public BookingController(BookingService bookingService) {
        this.bookingService = bookingService;
    }

    public CreateBookingResponseDto createBooking(CreateBookingRequestDto requestDto) {
        CreateBookingResponseDto responseDto = new CreateBookingResponseDto();

        try {
            Booking booking = bookingService.createBooking(
                    requestDto.getUserId(),
                    requestDto.getShowId(),
                    requestDto.getShowSeatIds()
            );

            responseDto.setResponseStatus(ResponseStatus.SUCCESS);
            responseDto.setBooking(booking);
        } catch (Exception e) {
            responseDto.setResponseStatus(ResponseStatus.FAILURE);
        }

        return responseDto;
    }
}