package com.aditya.bookmyshow.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Theater extends BaseModel{
    private String name;
    private String adress;

    @ManyToOne
    private City city;

    @OneToMany(mappedBy = "theater")
    private List<Auditorium> auditoriumList;

}
