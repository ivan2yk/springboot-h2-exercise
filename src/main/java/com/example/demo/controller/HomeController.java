package com.example.demo.controller;

import com.example.demo.domain.RoadMap;
import com.example.demo.service.RoadMapService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by Ivan on 28/10/2017.
 */
@Controller
public class HomeController {

    @Autowired
    private RoadMapService roadMapService;

    @RequestMapping("/")
    public String home(Model model) {
        List<RoadMap> all = roadMapService.getAll();
        model.addAttribute("roadMaps", all);
        return "index";
    }

}
