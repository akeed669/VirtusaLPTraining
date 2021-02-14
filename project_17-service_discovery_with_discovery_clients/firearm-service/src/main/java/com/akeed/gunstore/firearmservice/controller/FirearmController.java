package com.akeed.gunstore.firearmservice.controller;

import com.akeed.gunstore.model.firearm.Firearm;
import com.akeed.gunstore.firearmservice.service.FirearmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/services")
public class FirearmController {

    @Autowired
    FirearmService firearmService;

    @PostMapping("/firearms")
    public Firearm save(@RequestBody Firearm firearm){
        return firearmService.save(firearm);
    }

    @GetMapping("/firearms")
    public List<Firearm> getAllFirearms(){
        return firearmService.getAllFirearms();
    }

    @GetMapping("/firearms/{gunNumber}")
    public ResponseEntity<Firearm> getFirearm(@PathVariable(value="gunNumber") int gunNumber){

        System.out.println("Request came on "+ LocalDateTime.now()+" 3 >>>>>>");

        Firearm firearm = firearmService.getFirearm(gunNumber);

        if(firearm != null){
            return ResponseEntity.ok().body(firearm);
        }

        return ResponseEntity.notFound().build();
    }
}
