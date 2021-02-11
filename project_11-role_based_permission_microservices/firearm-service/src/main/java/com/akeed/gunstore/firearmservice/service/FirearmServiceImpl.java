package com.akeed.gunstore.firearmservice.service;

import com.akeed.gunstore.commons.model.Firearm;
import com.akeed.gunstore.firearmservice.repository.FirearmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FirearmServiceImpl implements FirearmService{

    @Autowired
    FirearmRepository firearmRepository;

    @Override
    public Firearm save(Firearm firearm) {

        return firearmRepository.save(firearm);
    }

    @Override
    public Firearm getFirearm(int gunNumber) {

        Optional<Firearm>firearm = firearmRepository.findById(gunNumber);

        if(firearm.isPresent()){
            return firearm.get();
        }

        return null;
    }

    @Override
    public List<Firearm> getAllFirearms() {

        return firearmRepository.findAll();
    }
}
