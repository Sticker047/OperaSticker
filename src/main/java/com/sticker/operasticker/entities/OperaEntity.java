package com.sticker.operasticker.entities;


import javax.persistence.*;

@Entity
public class OperaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int opera_id;

    @Column(insertable = false, updatable = false)
    private int theatre_id;
    private String name;
    private String definition;
    private int ageCategory;
    private int placesCount;
    private String places;

    @ManyToOne
    @JoinColumn(name = "theatre_id")
    private TheatreEntity theatreEntity;


}
