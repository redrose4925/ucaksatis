package com.ucaksatis.backend.services.abstracts;

import com.ucaksatis.backend.models.Ucak;

import java.util.List;

public interface UcakService {

    void add(Ucak ucak);
    void delete(int id);
    List<Ucak> getAll();

    Ucak getOne(int id);
}
