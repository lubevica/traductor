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
class Transition {
    @XmlAttribute
    protected String id;
    @XmlAttribute
    protected String from;
    @XmlAttribute
    protected String to;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public ConnectorGraphicsInfos getConnectorGraphicsInfos() {
        return connectorGraphicsInfos;
    }

    public void setConnectorGraphicsInfos(ConnectorGraphicsInfos connectorGraphicsInfos) {
        this.connectorGraphicsInfos = connectorGraphicsInfos;
    }
    protected ConnectorGraphicsInfos connectorGraphicsInfos;
}
