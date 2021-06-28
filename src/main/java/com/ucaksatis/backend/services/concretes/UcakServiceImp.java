package com.ucaksatis.backend.services.concretes;

import com.ucaksatis.backend.models.Ucak;
import com.ucaksatis.backend.repositories.UcakRepo;
import com.ucaksatis.backend.services.abstracts.UcakService;

import java.util.List;


public class UcakServiceImp implements UcakService {

    private final UcakRepo ucakRepo;

    public UcakServiceImp(UcakRepo ucakRepo) {
        this.ucakRepo = ucakRepo;
    }


    @Override
    public void add(Ucak ucak) {
        ucakRepo.save(ucak);
    }

    @Override
    public void delete(int id) {
        ucakRepo.deleteById(id);
    }


    @Override
    public List<Ucak> getAll() {
        return ucakRepo.findAll();
    }

    @Override
    public Ucak getOne(int id) {
        return ucakRepo.getOne(id);
    }
}
