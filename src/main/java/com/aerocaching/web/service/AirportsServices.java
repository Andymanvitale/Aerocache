package com.aerocaching.web.service;

import com.aerocaching.web.dto.AirportsDto;

import java.util.List;

public interface AirportsServices {
    List<AirportsDto> findAllAirports();
}
