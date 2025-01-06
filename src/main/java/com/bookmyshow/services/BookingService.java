package com.bookmyshow.services;


import com.bookmyshow.models.*;
import java.util.List;


public interface BookingService {
    Booking createBooking(Long userId, Long showId, List<Long> showSeatIds);
}