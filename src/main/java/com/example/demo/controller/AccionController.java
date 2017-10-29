package com.example.demo.controller;

import com.example.demo.domain.Accion;
import com.example.demo.domain.Colaborador;
import com.example.demo.repository.AccionRepository;
import com.example.demo.repository.ColaboradorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by Ivan on 28/10/2017.
 */
@Controller
@RequestMapping("/acciones")
public class AccionController {

    private AccionRepository accionRepository;
    private ColaboradorRepository colaboradorRepository;

    @Autowired
    public AccionController(AccionRepository accionRepository, ColaboradorRepository colaboradorRepository) {
        this.accionRepository = accionRepository;
        this.colaboradorRepository = colaboradorRepository;
    }

    @RequestMapping("/view/{id}")
    public String getAcciones(@PathVariable("id") Long id, Model model) {
        Colaborador colaborador = colaboradorRepository.findOne(id);
        List<Accion> allByRoadMapIdOrderByCreatedOnDesc = accionRepository.findAllByRoadMapIdOrderByCreatedOnDesc(id);
        model.addAttribute("colaborador", colaborador);
        model.addAttribute("acciones", allByRoadMapIdOrderByCreatedOnDesc);
        return "acciones/list";
    }

}
