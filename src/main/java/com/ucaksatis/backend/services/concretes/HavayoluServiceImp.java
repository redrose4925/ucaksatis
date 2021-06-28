package com.ucaksatis.backend.services.concretes;

import com.ucaksatis.backend.models.Havayolu;
import com.ucaksatis.backend.repositories.HavayoluRepo;
import com.ucaksatis.backend.services.abstracts.HavayoluService;

import java.util.List;

public class HavayoluServiceImp implements HavayoluService {

    private final HavayoluRepo havayoluRepo;

    public HavayoluServiceImp(HavayoluRepo havayoluRepo) {
        this.havayoluRepo = havayoluRepo;
    }

    @Override
    public void add(Havayolu havayolu) {
        havayoluRepo.save(havayolu);
    }

    @Override
    public void delete(int id) {
        havayoluRepo.deleteById(id);
    }

    @Override
    public List<Havayolu> getAll() {
        return havayoluRepo.findAll();
    }

    @Override
    public Havayolu getOne(int id) {
        return havayoluRepo.getOne(id);
    }
}
