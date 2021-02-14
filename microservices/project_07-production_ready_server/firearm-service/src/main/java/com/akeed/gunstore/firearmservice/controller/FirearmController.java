package com.akeed.gunstore.firearmservice.controller;

import com.akeed.gunstore.commons.model.Firearm;
import com.akeed.gunstore.firearmservice.service.FirearmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/firearms")
public class FirearmController {

    @Autowired
    FirearmService firearmService;

    @PostMapping("/profile")
    public Firearm save(@RequestBody Firearm firearm){
        return firearmService.save(firearm);
    }

    @GetMapping("/profiles")
    public List<Firearm> getAllFirearms(){
        return firearmService.getAllFirearms();
    }

    @GetMapping("/profile")
    public Firearm getFirearm(@RequestParam("gunNumber") int gunNumber){
        return firearmService.getFirearm(gunNumber);
    }
}
