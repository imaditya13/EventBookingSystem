package com.aditya.bookmyshow.services;

import com.aditya.bookmyshow.models.Show;
import com.aditya.bookmyshow.models.ShowSeat;
import com.aditya.bookmyshow.repositories.ShowRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ShowService {
    ShowRepository showRepository;
    @Autowired
    public ShowService(ShowRepository showRepository)
    {
        this.showRepository = showRepository;
    }

    public Optional<Show> getShowById(Long showId) {
        return showRepository.findById(showId);
    }

}
