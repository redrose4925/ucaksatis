package com.ucaksatis.backend.services.concretes;

import com.ucaksatis.backend.models.Havalimani;
import com.ucaksatis.backend.repositories.HavalimaniRepo;
import com.ucaksatis.backend.services.abstracts.HavalimaniService;

import java.util.List;

public class HavalimaniServiceImp implements HavalimaniService {

    private final HavalimaniRepo havalimaniRepo;

    public HavalimaniServiceImp(HavalimaniRepo havalimaniRepo) {
        this.havalimaniRepo = havalimaniRepo;
    }

    @Override
    public void add(Havalimani havalimani) {
        havalimaniRepo.save(havalimani);
    }

    @Override
    public void delete(int id) {
        havalimaniRepo.deleteById(id);
    }

    @Override
    public List<Havalimani> getAll() {
        return havalimaniRepo.findAll();
    }

    @Override
    public Havalimani getOne(int id) {
        return havalimaniRepo.getOne(id);
    }
}
