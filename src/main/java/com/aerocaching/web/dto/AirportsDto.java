package com.aerocaching.web.dto;

import lombok.Builder;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Data
@Builder

public class AirportsDto {
    private Long id;
    private String locId;
    private String stateId;
    private String city;
    private String name;
    private int elevation;
    private String sectional;
    private String unicom;
    private String ctaf;
    private String icaoId;
    private String latitude;
    private String longitude;
    @CreationTimestamp
    private LocalDateTime createdOn;
    @UpdateTimestamp
    private LocalDateTime updatedOn;
}
