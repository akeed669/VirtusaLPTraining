package com.akeed.gunstore.firearmservice.service;

import com.akeed.gunstore.model.firearm.Firearm;

import java.util.List;

public interface FirearmService {

    Firearm save(Firearm firearm);

    Firearm getFirearm(int gunNumber);

    List<Firearm> getAllFirearms();
}
