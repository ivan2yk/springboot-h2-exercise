package com.example.demo;

import com.example.demo.domain.RoadMap;
import com.example.demo.service.LoaderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.List;

@SpringBootApplication
public class H2ExerciseApplication {

    private LoaderService loaderService;
    private static final Logger LOGGER = LoggerFactory.getLogger(H2ExerciseApplication.class);

    @Autowired
    public H2ExerciseApplication(LoaderService loaderService) {
        this.loaderService = loaderService;
    }

    public static void main(String[] args) {
        SpringApplication.run(H2ExerciseApplication.class, args);
    }

    @PostConstruct
    public void loadData() {
        loaderService.load0();

        List<RoadMap> roadMapByColaborador = loaderService.getRoadMapByColaborador(2L);

        LOGGER.info("Obtiendo hojas de ruta de colaborador 2 --------------------------------------------------");
        for (RoadMap roadMap : roadMapByColaborador) {
            LOGGER.info("Hoja de ruta -> {}, {}, {}",
                    roadMap.getColaborador().getFirstName() + ", " + roadMap.getColaborador().getLastName(),
                    roadMap.getRoadMapDate(),
                    roadMap.getAccions() != null ? roadMap.getAccions().size() : 0);
        }
    }

}
