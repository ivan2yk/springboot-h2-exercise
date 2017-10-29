package com.example.demo.domain;

import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * Created by Ivan on 28/10/2017.
 */
@Entity
public class RoadMap {

    @Id
    @GeneratedValue
    private Long id;

    @Column(columnDefinition = "DATE")
    private Date roadMapDate;

    @ManyToOne
    private State state;

    @ManyToOne
    private Colaborador colaborador;

    @OneToMany(mappedBy = "roadMap", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<Accion> accions;

    @CreatedDate
    @Column(columnDefinition = "TIMESTAMP")
    private Date createdOn;

    public List<Accion> getAccions() {
        return accions;
    }

    public void setAccions(List<Accion> accions) {
        this.accions = accions;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getRoadMapDate() {
        return roadMapDate;
    }

    public void setRoadMapDate(Date roadMapDate) {
        this.roadMapDate = roadMapDate;
    }

    public Colaborador getColaborador() {
        return colaborador;
    }

    public void setColaborador(Colaborador colaborador) {
        this.colaborador = colaborador;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    @Override
    public String toString() {
        return "RoadMap{" +
                "id=" + id +
                ", roadMapDate=" + roadMapDate +
                ", colaborador=" + colaborador +
                ", accions=" + accions +
                ", createdOn=" + createdOn +
                '}';
    }
}
