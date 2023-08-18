package com.aditya.bookmyshow.repositories;

import com.aditya.bookmyshow.models.ShowSeat;
import jakarta.persistence.LockModeType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Lock;

import java.util.List;

public interface ShowSeatRepository extends JpaRepository<ShowSeat,Long> {
    List<ShowSeat> findAllByIdIn(List<Long> showSeatIds);
    @Lock(LockModeType.PESSIMISTIC_READ)
    List<ShowSeat>findAllByIdInAndShowSeatStatusAvailable(List<Long>showSeatIds);

    ShowSeat save(ShowSeat showSeat); //UPSERT
}
