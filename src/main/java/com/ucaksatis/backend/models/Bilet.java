package com.ucaksatis.backend.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Bilet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotNull
    @NotBlank
    private String kalkisYeri;


    @NotNull
    @NotBlank
    private String varisYeri;

    @NotNull
    @NotBlank
    private int kalkisSaati;

    @NotNull
    @NotBlank
    private int varisSaati;

    @ManyToOne
    private Satis satis;


}