/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package traductorxpdlxml.xpdl;

import javax.xml.bind.annotation.XmlAttribute;
import traductorxpdlxml.xpdl.Id;

/**
 *
 * @author PC01
 */
class ProcessType {
    @XmlAttribute
    protected Id id;
    @XmlAttribute
    protected String name;

    public Id getId() {
        return id;
    }

    public void setId(Id id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
