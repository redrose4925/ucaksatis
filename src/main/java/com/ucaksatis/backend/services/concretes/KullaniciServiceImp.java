package com.ucaksatis.backend.services.concretes;

import com.ucaksatis.backend.models.Kullanici;
import com.ucaksatis.backend.repositories.KullaniciRepo;
import com.ucaksatis.backend.services.abstracts.KullaniciService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KullaniciServiceImp implements KullaniciService {

    private final KullaniciRepo kullaniciRepo;

    public KullaniciServiceImp(KullaniciRepo kullaniciRepo) {
        this.kullaniciRepo = kullaniciRepo;
    }

    @Override
    public void add(Kullanici kullanici) {
        kullaniciRepo.save(kullanici);
    }

    @Override
    public void delete(int id) {
        kullaniciRepo.deleteById(id);
    }

    @Override
    public List<Kullanici> getAll() {
        return kullaniciRepo.findAll();
    }

    @Override
    public Kullanici getOne(int id) {
        return kullaniciRepo.getOne(id);
    }

    @Override
    public Kullanici login(String email, String sifre) {
        List<Kullanici> result =  kullaniciRepo.findByEmailAndSifre(email,sifre);
        if(result.size()==0){
            return new Kullanici();
        }
        return result.get(0);

    }
}
