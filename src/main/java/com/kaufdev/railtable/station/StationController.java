package com.kaufdev.railtable.station;

import com.kaufdev.railtable.transfer.domain.Station;
import com.kaufdev.railtable.transfer.infrastracture.StationAssembler;
import com.kaufdev.railtable.transfer.infrastracture.StationDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/station")
public class StationController{
    private StationRepository stationRepository;
    private StationAssembler stationAssembler;

    @Autowired
    public StationController(StationRepository stationRepository, StationAssembler stationAssembler) {
        this.stationRepository = stationRepository;
        this.stationAssembler = stationAssembler;
    }

    @GetMapping("/search")
    public List<StationDto> getStationsBy(@RequestParam String stationNameProposal){
        return stationRepository.findByNameStartsWithIgnoreCase(stationNameProposal).stream()
                .map(stationAssembler::assemble).collect(Collectors.toList());
    }
}
