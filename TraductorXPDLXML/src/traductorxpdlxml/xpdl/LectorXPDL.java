/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package traductorxpdlxml.xpdl;

import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

/**
 *
 * @author PC01
 */
public class LectorXPDL {
    {
        try {
            //Crear el contexto JAXB
            JAXBContext jc = JAXBContext.newInstance(Package.class);
            //Permite leer archivos XML
            Unmarshaller u = jc.createUnmarshaller();
            Package product = (Package)u.unmarshal(new File("product.xml"));
        } catch (JAXBException ex) {
            Logger.getLogger(LectorXPDL.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
}
