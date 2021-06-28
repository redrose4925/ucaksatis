package com.ucaksatis.backend.services.abstracts;

import com.ucaksatis.backend.models.Havayolu;


import java.util.List;

public interface HavayoluService{

    void add(Havayolu havayolu);
    void delete(int id);
    List<Havayolu> getAll();

    Havayolu getOne(int id);
}
