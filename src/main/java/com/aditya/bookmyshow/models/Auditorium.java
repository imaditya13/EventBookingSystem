package com.aditya.bookmyshow.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@Entity
public class Auditorium extends BaseModel{
    private String name;

     @OneToMany
    private List<Seat>seatList;

    @ElementCollection
    @Enumerated(EnumType.ORDINAL)
    private List<Feature>featureList;
    @ManyToOne
    private Theater theater;
}

//Audi : Seat
//1    :  M
//1    :  1

//Audi : Feature
//1    :  M
//M    :  M
