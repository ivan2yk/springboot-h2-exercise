package com.example.demo.domain;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Ivan on 28/10/2017.
 */
@Entity
public class Accion {

    @Id
    @GeneratedValue
    private Long id;

    @Column(length = 50, name = "accion", columnDefinition = "VARCHAR")
    private String accionEnum;

    @ManyToOne
    private RoadMap roadMap;

    @Column(columnDefinition = "TIMESTAMP")
    private Date createdOn;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAccionEnum() {
        return accionEnum;
    }

    public void setAccionEnum(String accionEnum) {
        this.accionEnum = accionEnum;
    }

    public RoadMap getRoadMap() {
        return roadMap;
    }

    public void setRoadMap(RoadMap roadMap) {
        this.roadMap = roadMap;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    @Override
    public String toString() {
        return "Accion{" +
                "id=" + id +
                ", accionEnum=" + accionEnum +
                ", roadMap=" + roadMap +
                ", createdOn=" + createdOn +
                '}';
    }
}
