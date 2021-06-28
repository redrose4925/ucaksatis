package com.ucaksatis.backend.services.abstracts;

import com.ucaksatis.backend.models.Havalimani;

import java.util.List;

public interface HavalimaniService {

    void add(Havalimani havalimani);
    void delete(int id);
    List<Havalimani> getAll();

    Havalimani getOne(int id);
}
