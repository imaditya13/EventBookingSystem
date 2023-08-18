package com.aditya.bookmyshow.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@MappedSuperclass
public class BaseModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

}
/*
@MappedSuperClass -> This is the parent class of all the classes which are extending this
also the column within this class will be propagated in every child class as their column.
*/
