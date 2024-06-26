package com.example.PROJETFILROUGE_CARSAVVY.model;


import com.example.PROJETFILROUGE_CARSAVVY.view.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonView;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "vente")
public class Vente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;

    @Column(nullable = false, length = 100)
    @JsonView(VenteView.class)
    protected int prix;

    @JsonView (VenteView.class)
    protected Date date_rentre;

    @JsonView({VenteView.class})
    protected Date date_vente;


    @JsonView({VenteView.class})
    protected int annee;

    @JsonView({VenteView.class})
    @Column(nullable = false, length = 100)
    protected String immat;

    @JsonView({VenteView.class})
    @Column(columnDefinition = "TEXT")
    protected String imgUrl;

    @JsonView({VenteView.class,VehiculeView.class, ModeleView.class, MarqueView.class})
    @JoinColumn(name = "id_vehicule")
    @ManyToOne
    protected Vehicule vehicule;



}