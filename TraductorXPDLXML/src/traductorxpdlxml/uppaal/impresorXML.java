/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package traductorxpdlxml.uppaal;

import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.bind.Marshaller;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import traductorxpdlxml.xpdl.LectorXPDL;

/**
 *
 * @author HP
 */
public class impresorXML {
    {
        try {
            nta princ= new nta();
            //Contexto
            JAXBContext context = JAXBContext.newInstance(nta.class);
            //Realiza la conversion de los objetos Java a XML
            Marshaller m = context.createMarshaller();
            //Preparando el formato del archivo XML    
            m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            //Realiza la conversion a XML
            m.marshal(princ, new File("product.xml"));
        } catch (JAXBException ex) {
            Logger.getLogger(LectorXPDL.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
}