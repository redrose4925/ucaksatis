package com.ucaksatis.backend.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Kullanici {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotNull
    @NotBlank
    private String kullaniciAdi;

    @NotNull
    @NotBlank
    private String email;

    @NotNull
    @NotBlank
    private String sifre;

    @NotNull
    @NotBlank
    private String ad;

    @NotNull
    @NotBlank
    private String soyad;

    @NotNull
    @NotBlank
    private String tckNo;

}
