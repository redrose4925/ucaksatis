package com.ucaksatis.backend.services.abstracts;

import com.ucaksatis.backend.models.Bilet;

import java.util.List;

public interface BiletService {
    void add(Bilet bilet);
    void delete(int id);
    List<Bilet> getAll();

    Bilet getOne(int id);
}
