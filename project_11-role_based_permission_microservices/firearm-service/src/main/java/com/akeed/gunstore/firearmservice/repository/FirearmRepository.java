package com.akeed.gunstore.firearmservice.repository;

import com.akeed.gunstore.commons.model.Firearm;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FirearmRepository extends JpaRepository<Firearm, Integer> {
}
