package com.ucaksatis.backend.services.concretes;

import com.ucaksatis.backend.models.Bilet;
import com.ucaksatis.backend.repositories.BiletRepo;
import com.ucaksatis.backend.services.abstracts.BiletService;

import java.util.List;

public class BiletServiceImp implements BiletService {
    private final BiletRepo biletRepo;

    public BiletServiceImp(BiletRepo biletRepo) {
        this.biletRepo = biletRepo;
    }

    @Override
    public void add(Bilet bilet) {
        biletRepo.save(bilet);
    }

    @Override
    public void delete(int id) {
        biletRepo.deleteById(id);
    }

    @Override
    public List<Bilet> getAll() {
        return biletRepo.findAll();
    }

    @Override
    public Bilet getOne(int id) {
        return biletRepo.getOne(id);
    }
}
