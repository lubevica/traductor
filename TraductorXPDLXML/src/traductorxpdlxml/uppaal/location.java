/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package traductorxpdlxml.uppaal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author HP
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="")
class location {
     @XmlAttribute
     protected String id;
     @XmlAttribute
     protected int x;
     @XmlAttribute
     protected int y;
     protected name nombre;
     protected urgent urg;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }



    public name getNombre() {
        return nombre;
    }

    public void setNombre(name nombre) {
        this.nombre = nombre;
    }

    public urgent getUrg() {
        return urg;
    }

    public void setUrg(urgent urg) {
        this.urg = urg;
    }
}
