package com.aditya.bookmyshow.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
public class Show extends  BaseModel{
    @ManyToOne
    private Movie movie;

    @ManyToOne
    private Auditorium auditorium;

    private Date startTime;
    private Date endTime;

    @ElementCollection
    @Enumerated(EnumType.ORDINAL)
    private List<Feature>showFeatures;

}
