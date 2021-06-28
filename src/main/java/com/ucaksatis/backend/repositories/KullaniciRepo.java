package com.ucaksatis.backend.repositories;

import com.ucaksatis.backend.models.Kullanici;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface KullaniciRepo extends JpaRepository<Kullanici,Integer> {

 public  List<Kullanici> findByEmailAndSifre(String email, String sifre);
}
