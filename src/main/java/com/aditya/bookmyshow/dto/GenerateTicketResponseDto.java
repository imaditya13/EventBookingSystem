package com.aditya.bookmyshow.dto;

import com.aditya.bookmyshow.models.ResponseStatus;
import com.aditya.bookmyshow.models.Ticket;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class GenerateTicketResponseDto {
    private Ticket ticket;
    private ResponseStatus responseStatus;
}
