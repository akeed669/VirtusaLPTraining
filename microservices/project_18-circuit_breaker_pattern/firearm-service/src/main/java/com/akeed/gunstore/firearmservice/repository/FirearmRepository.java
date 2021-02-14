package com.akeed.gunstore.firearmservice.repository;

import com.akeed.gunstore.model.firearm.Firearm;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FirearmRepository extends JpaRepository<Firearm, Integer> {
}
