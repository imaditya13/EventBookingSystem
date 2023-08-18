package com.aditya.bookmyshow.repositories;

import com.aditya.bookmyshow.models.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;


public interface TicketRepository extends JpaRepository<Ticket,Long> {
}
