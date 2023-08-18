package com.aditya.bookmyshow.repositories;

import com.aditya.bookmyshow.models.Show;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ShowRepository extends JpaRepository<Show,Long> {

    Optional<Show> findById(Long showId);
}
