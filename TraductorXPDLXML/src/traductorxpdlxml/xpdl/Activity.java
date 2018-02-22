/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package traductorxpdlxml.xpdl;

import javax.xml.bind.annotation.XmlAttribute;
import traductorxpdlxml.xpdl.Id;
import traductorxpdlxml.xpdl.Event;
import traductorxpdlxml.xpdl.NodeGraphicsInfos;
import traductorxpdlxml.xpdl.Implementation;

/**
 *
 * @author PC01
 */
class Activity {
    @XmlAttribute
    protected Id id;
    @XmlAttribute
    protected String nombre;
    protected Event event;
    protected NodeGraphicsInfos nodeGraphicsInfos;
    protected Implementation implementation;

    public Id getId() {
        return id;
    }

    public void setId(Id id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    public NodeGraphicsInfos getNodeGraphicsInfos() {
        return nodeGraphicsInfos;
    }

    public void setNodeGraphicsInfos(NodeGraphicsInfos nodeGraphicsInfos) {
        this.nodeGraphicsInfos = nodeGraphicsInfos;
    }

    public Implementation getImplementation() {
        return implementation;
    }

    public void setImplementation(Implementation implementation) {
        this.implementation = implementation;
    }
    
}
