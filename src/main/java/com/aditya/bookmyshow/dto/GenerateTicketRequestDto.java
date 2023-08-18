package com.aditya.bookmyshow.dto;

import com.aditya.bookmyshow.models.ResponseStatus;
import com.aditya.bookmyshow.models.ShowSeat;
import com.aditya.bookmyshow.models.Ticket;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class GenerateTicketRequestDto {
      private Long showId;
      private Long userId;
      private List<Long> showSeatIds;

}
