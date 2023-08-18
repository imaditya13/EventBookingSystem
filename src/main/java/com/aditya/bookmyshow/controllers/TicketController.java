package com.aditya.bookmyshow.controllers;

import com.aditya.bookmyshow.Exception.ShowNotFoundException;
import com.aditya.bookmyshow.Exception.ShowSeatNotFoundException;
import com.aditya.bookmyshow.Exception.UserNotFoundException;
import com.aditya.bookmyshow.dto.GenerateTicketRequestDto;
import com.aditya.bookmyshow.dto.GenerateTicketResponseDto;
import com.aditya.bookmyshow.models.ResponseStatus;
import com.aditya.bookmyshow.models.Ticket;
import com.aditya.bookmyshow.services.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class TicketController {
    TicketService ticketService;
    @Autowired
    public TicketController(TicketService ticketService)
    {
        this.ticketService = ticketService;
    }
        public GenerateTicketResponseDto bookMovieTicket(GenerateTicketRequestDto requestDto)
        {
            GenerateTicketResponseDto responseDto = new GenerateTicketResponseDto();
            Ticket ticket = null;
            try {
                ticket = ticketService.createTicket(requestDto.getShowId(),requestDto.getUserId(),
                                                         requestDto.getShowSeatIds());
                responseDto.setTicket(ticket);
                responseDto.setResponseStatus(ResponseStatus.SUCCESS);
            } catch (ShowSeatNotFoundException e) {
               System.out.println(e.getMessage());
               responseDto.setResponseStatus(ResponseStatus.FAILURE);
            } catch (UserNotFoundException e) {
                System.out.println(e.getMessage());
                responseDto.setResponseStatus(ResponseStatus.FAILURE);
            } catch (ShowNotFoundException e) {
                System.out.println(e.getMessage());
                responseDto.setResponseStatus(ResponseStatus.FAILURE);
            }

            return responseDto;
        }
}
