package com.example.demo.service;

import com.example.demo.domain.Accion;
import com.example.demo.domain.AccionEnum;
import com.example.demo.domain.Colaborador;
import com.example.demo.domain.RoadMap;
import com.example.demo.repository.AccionRepository;
import com.example.demo.repository.ColaboradorRepository;
import com.example.demo.repository.RoadMapRepository;
import com.sun.corba.se.spi.logging.CORBALogDomains;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Date;
import java.util.List;

/**
 * Created by Ivan on 28/10/2017.
 */
@Service
public class LoaderService {


    private ColaboradorRepository colaboradorRepository;
    private RoadMapRepository roadMapRepository;
    private AccionRepository accionRepository;

    @Autowired
    public LoaderService(ColaboradorRepository colaboradorRepository, RoadMapRepository roadMapRepository, AccionRepository accionRepository) {
        this.colaboradorRepository = colaboradorRepository;
        this.roadMapRepository = roadMapRepository;
        this.accionRepository = accionRepository;
    }

    public List<RoadMap> getRoadMapByColaborador(Long idColaborador) {
        return roadMapRepository.findByColaboradorIdOrderByCreatedOnDesc(idColaborador);
    }

    @Transactional
    public void load0() {
        Colaborador colaborador = new Colaborador();
        colaborador.setDni("46567850");
        colaborador.setFirstName("Ivan");
        colaborador.setLastName("Leiva");
        colaborador.setEmail("ileiva@inclouds.biz");
        colaborador.setCreatedOn(new Date());
        colaboradorRepository.save(colaborador);

        RoadMap roadMap = new RoadMap();
        roadMap.setColaborador(colaborador);
        roadMap.setRoadMapDate(new Date());
        roadMap.setCreatedOn(new Date());
        roadMapRepository.save(roadMap);

        Accion accion1 = new Accion();
        accion1.setAccionEnum(AccionEnum.VISITA.name());
        accion1.setRoadMap(roadMap);
        accion1.setCreatedOn(new Date());
        accionRepository.save(accion1);

        Accion accion2 = new Accion();
        accion2.setAccionEnum(AccionEnum.VISITA.name());
        accion2.setRoadMap(roadMap);
        accion2.setCreatedOn(new Date());
        accionRepository.save(accion2);
    }


}
