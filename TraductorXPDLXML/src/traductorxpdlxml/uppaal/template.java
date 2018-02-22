/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package traductorxpdlxml.uppaal;
/**
 *
 * @author HP
 */
public class template {
    protected name nombre;
    protected declaration decl;
    protected location locati;
    protected init inic;
    protected transition transt;

    public name getNombre() {
        return nombre;
    }

    public void setNombre(name nombre) {
        this.nombre = nombre;
    }

    public declaration getDecl() {
        return decl;
    }

    public void setDecl(declaration decl) {
        this.decl = decl;
    }

    public location getLocati() {
        return locati;
    }

    public void setLocati(location locati) {
        this.locati = locati;
    }

    public init getInic() {
        return inic;
    }

    public void setInic(init inic) {
        this.inic = inic;
    }

    public transition getTranst() {
        return transt;
    }

    public void setTranst(transition transt) {
        this.transt = transt;
    }

}
