package com.hjy.hera.map.pojo;


import com.vividsolutions.jts.geom.MultiPolygon;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Spot implements Serializable {
    @Id
    @GeneratedValue
    private Integer gid;

    @Column(name = "geom",columnDefinition = "geometry(MultiPolygon,4490)")
    private MultiPolygon geom;

    public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
    }

    public MultiPolygon getGeom() {
        return geom;
    }

    public void setGeom(MultiPolygon geom) {
        this.geom = geom;
    }
}
