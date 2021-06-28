package com.ucaksatis.backend.services.abstracts;

import com.ucaksatis.backend.models.Kullanici;


import java.util.List;

public interface KullaniciService {

    void add(Kullanici kullanici);
    void delete(int id);
    List<Kullanici> getAll();

    Kullanici getOne(int id);

   Kullanici login(String email, String sifre);
}
