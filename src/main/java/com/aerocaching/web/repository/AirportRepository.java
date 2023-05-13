package com.aerocaching.web.repository;

import com.aerocaching.web.models.Airports;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AirportRepository extends JpaRepository <Airports, Long> {
    Optional<Airports> findByName(String url);
}
