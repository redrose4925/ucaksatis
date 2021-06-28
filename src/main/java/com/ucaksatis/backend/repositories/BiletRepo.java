package com.ucaksatis.backend.repositories;

import com.ucaksatis.backend.models.Bilet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BiletRepo extends JpaRepository<Bilet,Integer> {
}
