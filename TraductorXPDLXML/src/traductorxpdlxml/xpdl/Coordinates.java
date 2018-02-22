/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package traductorxpdlxml.xpdl;

import javax.xml.bind.annotation.XmlAttribute;

/**
 *
 * @author PC01
 */
class Coordinates {
    @XmlAttribute
    protected Double XCoordinate;
    @XmlAttribute
    protected Double YCoordinate;

    public Double getXCoordinate() {
        return XCoordinate;
    }

    public void setXCoordinate(Double XCoordinate) {
        this.XCoordinate = XCoordinate;
    }

    public Double getYCoordinate() {
        return YCoordinate;
    }

    public void setYCoordinate(Double YCoordinate) {
        this.YCoordinate = YCoordinate;
    }
}
