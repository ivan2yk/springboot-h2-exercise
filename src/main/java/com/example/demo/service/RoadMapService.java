package com.example.demo.service;

import com.example.demo.domain.RoadMap;
import com.example.demo.repository.RoadMapRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Ivan on 28/10/2017.
 */
@Service
public class RoadMapService {

    private RoadMapRepository roadMapRepository;

    @Autowired
    public RoadMapService(RoadMapRepository roadMapRepository) {
        this.roadMapRepository = roadMapRepository;
    }

    public List<RoadMap> getAll() {
        return roadMapRepository.findAllByOrderByRoadMapDateDesc();
    }

}
