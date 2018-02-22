/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package traductorxpdlxml.uppaal;
import javax.xml.bind.annotation.XmlAttribute;

import javax.xml.bind.annotation.XmlRootElement;

import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author HP
 */
@XmlRootElement
public class nta {
    
    public declaration decl;
    public template temp;
    public system syst;
    public queries quer;
    
    public declaration getDecl() {
        return decl;
    }

    public void setDecl(declaration decl) {
        this.decl = decl;
    }

    public template getTemp() {
        return temp;
    }

    public void setTemp(template temp) {
        this.temp = temp;
    }

    public system getSyst() {
        return syst;
    }

    public void setSyst(system syst) {
        this.syst = syst;
    }

    public queries getQuer() {
        return quer;
    }

    public void setQuer(queries quer) {
        this.quer = quer;
    }
}
