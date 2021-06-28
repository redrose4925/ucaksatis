package com.ucaksatis.backend.services.abstracts;

import com.ucaksatis.backend.models.Satis;


import java.util.List;

public interface SatisService {
    void add(Satis satis);
    void delete(int id);
    List<Satis> getAll();

    Satis getOne(int id);
}
