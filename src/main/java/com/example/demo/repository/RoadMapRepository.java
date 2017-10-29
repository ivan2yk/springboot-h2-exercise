package com.example.demo.repository;

import com.example.demo.domain.RoadMap;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Ivan on 28/10/2017.
 */
public interface RoadMapRepository extends CrudRepository<RoadMap, Long> {

    List<RoadMap> findByColaboradorIdOrderByCreatedOnDesc(Long id);

    List<RoadMap> findAllByOrderByRoadMapDateDesc();

}
