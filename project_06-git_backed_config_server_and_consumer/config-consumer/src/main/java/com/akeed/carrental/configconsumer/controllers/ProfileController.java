package com.akeed.carrental.configconsumer.controllers;
import com.akeed.carrental.configconsumer.models.MemberProfileConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProfileController {

    @Autowired
    MemberProfileConfiguration memberProfileConfiguration;

    @RequestMapping("/profile")
    public String getConfig(Model model){
        model.addAttribute("model",memberProfileConfiguration.getDefaultModel());
        model.addAttribute("min",memberProfileConfiguration.getMinRentPeriod());
        return "mprofile";
    }

    @GetMapping("/test")
    public String getNothing(){
        return "<h1> hello </h1>";
    }
}
