package com.aerocaching.web.service.impl;

import com.aerocaching.web.dto.AirportsDto;
import com.aerocaching.web.models.Airports;
import com.aerocaching.web.repository.AirportRepository;
import com.aerocaching.web.service.AirportsServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
@Service
public class AirportServiceImpl implements AirportsServices {
    private AirportRepository airportRepository;

    @Autowired
    public AirportServiceImpl(AirportRepository airportRepository) {
        this.airportRepository = airportRepository;
    }
    @Override
    public List<AirportsDto> findAllAirports() {
        List<Airports> airports = airportRepository.findAll();
        return airports.stream().map((airport) -> mapToAirportDto((Airports) airports)).collect(Collectors.toList());
    }

    private AirportsDto mapToAirportDto(Airports airports) {
        AirportsDto airportsDto = AirportsDto.builder()
                .id(airports.getId())
                .locId(airports.getLocId())
                .city(airports.getCity())
                .ctaf(airports.getCtaf())
                .name(airports.getName())
                .elevation(airports.getElevation())
                .stateId(airports.getStateId())
                .sectional(airports.getSectional())
                .unicom(airports.getUnicom())
                .icaoId(airports.getIcaoId())
                .latitude(airports.getLatitude())
                .longitude(airports.getLongitude())
                .build();
        return airportsDto;
    }
}
