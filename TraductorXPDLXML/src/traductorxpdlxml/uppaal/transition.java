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
class transition {
    protected source sour;
    protected target targ;
    protected nail nai;

    public source getSour() {
        return sour;
    }

    public void setSour(source sour) {
        this.sour = sour;
    }

    public target getTarg() {
        return targ;
    }

    public void setTarg(target targ) {
        this.targ = targ;
    }

    public nail getNai() {
        return nai;
    }

    public void setNai(nail nai) {
        this.nai = nai;
    }

}
