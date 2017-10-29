package com.example.demo.repository;

import com.example.demo.domain.Accion;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Ivan on 28/10/2017.
 */
@Repository
public interface AccionRepository extends CrudRepository<Accion, Long> {

    List<Accion> findAllByRoadMapIdOrderByCreatedOnDesc(Long id);

}
