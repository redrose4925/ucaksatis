package com.ucaksatis.backend.services.concretes;

import com.ucaksatis.backend.models.Satis;
import com.ucaksatis.backend.repositories.SatisRepo;
import com.ucaksatis.backend.services.abstracts.SatisService;

import java.util.List;

public class SatisServiceImp implements SatisService {

    private final SatisRepo satisRepo;

    public SatisServiceImp(SatisRepo satisRepo) {
        this.satisRepo = satisRepo;
    }

    @Override
    public void add(Satis satis) {
    satisRepo.save(satis);
    }

    @Override
    public void delete(int id) {
        satisRepo.deleteById(id);
    }

    @Override
    public List<Satis> getAll() {
        return satisRepo.findAll();
    }

    @Override
    public Satis getOne(int id) {
        return satisRepo.getOne(id);
    }
}
