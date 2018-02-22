/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package traductorxpdlxml.xpdl;

import traductorxpdlxml.xpdl.StartEvent;
import traductorxpdlxml.xpdl.EndEvent;
/**
 *
 * @author PC01
 */
class Event {
    protected StartEvent startEvent;
    protected EndEvent endEvent;

    public StartEvent getStartEvent() {
        return startEvent;
    }

    public void setStartEvent(StartEvent startEvent) {
        this.startEvent = startEvent;
    }

    public EndEvent getEndEvent() {
        return endEvent;
    }

    public void setEndEvent(EndEvent endEvent) {
        this.endEvent = endEvent;
    }
}
