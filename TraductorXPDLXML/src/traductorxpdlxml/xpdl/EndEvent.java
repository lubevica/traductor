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
class EndEvent {
    @XmlAttribute
    protected String Result;

    public String getResult() {
        return Result;
    }

    public void setResult(String Result) {
        this.Result = Result;
    }
}
