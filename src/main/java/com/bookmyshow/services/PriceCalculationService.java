package com.bookmyshow.services;

import com.bookmyshow.models.Show;
import com.bookmyshow.models.ShowSeat;
import com.bookmyshow.models.ShowSeatType;
import com.bookmyshow.repositories.ShowSeatTyperepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PriceCalculationService {
    private ShowSeatTyperepository showSeatTyperepository;

    public PriceCalculationService(ShowSeatTyperepository showSeatTyperepository) {
        this.showSeatTyperepository = showSeatTyperepository;
    }

    public int calculateAmount(List<ShowSeat> showSeats) {
        Show show = showSeats.get(0).getShow();

        List<ShowSeatType> showSeatTypes = showSeatTyperepository.findAllByShow(show);

        int amount = 0;
        for (ShowSeat showSeat : showSeats) {
            for (ShowSeatType showSeatType : showSeatTypes) {
                if (showSeat.getSeat().getSeatType().equals(showSeatType.getSeatType())) {
                    amount += showSeatType.getPrice();
                    break;
                }
            }
        }

        return amount;
    }
}
