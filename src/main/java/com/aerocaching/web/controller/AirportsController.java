package com.aerocaching.web.controller;

import ch.qos.logback.core.model.Model;
import com.aerocaching.web.dto.AirportsDto;
import com.aerocaching.web.service.AirportsServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class AirportsController {
    private AirportsServices airportsServices;
    @Autowired
    public AirportsController(AirportsServices airportsServices) {
        this.airportsServices = airportsServices;
    }

    @GetMapping("/Airports")
    public String listAirports(Model model) {
        List<AirportsDto> airports = airportsServices.findAllAirports();
        model.addAttribute("Airports", airports);
        return "airports-list";
    }
}

