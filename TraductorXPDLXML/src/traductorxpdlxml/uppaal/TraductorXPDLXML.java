/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this Template file, choose Tools | Templates
 * and open the Template in the editor.
 */
package traductorxpdlxml.uppaal;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import org.wfmc._2009.xpdl2.Activities;
import org.wfmc._2009.xpdl2.Activity;
import org.wfmc._2009.xpdl2.NodeGraphicsInfo;
import org.wfmc._2009.xpdl2.WorkflowProcesses;
import sun.net.www.content.audio.wav;
import traductorxpdlxml.uppaal.*;

/**
 *
 * @author HP
 */
public class TraductorXPDLXML {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        // TODO code application logic here
        ReaderXPDL();
        Rules();
        PrinterXML();
    }

    public static org.wfmc._2009.xpdl2.PackageType ReaderXPDL() {
        {
            String path = "Proceso Ad Hoc.xpdl";
            XMLInputFactory factory = XMLInputFactory.newInstance(); // Factory para obtener xmlreaders
		try {
			JAXBContext xpdlContext = JAXBContext.newInstance(org.wfmc._2009.xpdl2.PackageType.class); // Contexto JAXB con la clase que corresponde al root del xml 
			Unmarshaller unmarshallerXpdl = xpdlContext.createUnmarshaller();
			File file = new File(path);
			if(file.exists()){
				XMLStreamReader reader = factory.createXMLStreamReader(new FileReader(path)); // XML reader que usara JAXB el cual apunta al archivo a leer
				JAXBElement<org.wfmc._2009.xpdl2.PackageType> jaxbPackage = unmarshallerXpdl.unmarshal(reader,org.wfmc._2009.xpdl2.PackageType.class); //Aca es cuando efectivamente des-serializa
				
				org.wfmc._2009.xpdl2.PackageType packageType = jaxbPackage.getValue(); // Aca obtengo el elemento root del xml 
				org.wfmc._2009.xpdl2.PackageHeader header = packageType.getPackageHeader();
				//System.out.println(packageType.getName());
				//System.out.println("Vendor: " + header.getVendor().getValue());
				//System.out.println("Version: " + header.getXPDLVersion().getValue());
				//System.out.println("Documentation: " + header.getDocumentation().getValue());
				return packageType;
			}else{
				System.out.println(file.getAbsolutePath());
			}
			
		} catch (JAXBException | FileNotFoundException | XMLStreamException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
                
                
        }
        return null;
    }

    public static Nta Rules() {
        //Obtener datos del archivo XPDL
        org.wfmc._2009.xpdl2.PackageType packageType =ReaderXPDL();
        //Crear variable con formato del archivo XML
        Nta nta= new Nta();
        List <Template>temp=new ArrayList();
        Template newObjectTemplate= new Template();
        Name newObjectName= new Name();
        //Asignacion de nombre de Pools a Roles 
        
        for (org.wfmc._2009.xpdl2.Pool pool : packageType.getPools().getPool()){
                    if (pool.isBoundaryVisible()==true)
                    {
                        newObjectName.setValue(pool.getName());
                        newObjectName.setX(5);
                        newObjectName.setY(5);
                        newObjectTemplate.setName(newObjectName);
                        temp.add(newObjectTemplate);
                    }
            }
        nta.setTemplate(temp);
        //Recorrer los WorkflowProcess
        Location location =new Location();
        for (org.wfmc._2009.xpdl2.Activity activity : packageType.getGlobalActivities().getActivity()){
                    if (activity.getName()=="Inicio")
                    {
                        location.setId(activity.getId());
                        location.setUrgent("");
                        location.setX(0);
                        location.setY(0);
                        newObjectTemplate.setName(newObjectName);
                        temp.add(newObjectTemplate);
                    }
            }
        nta.setTemplate(temp);
        
         /*for (Template obj : nta.getTemplate()){
            System.out.println(newObjectName.getValue());   
         }*/
        return nta;
    }


    public static void PrinterXML() {
        
        try {
            
            Nta princ= Rules();
            /*Ddeclaration dec= new Ddeclaration();
            dec.setValue("luca");
            princ.setDeclaration(dec);*/
            //Contexto
            JAXBContext context = JAXBContext.newInstance(Nta.class);
            //Realiza la conversion de los objetos Java a XML
            Marshaller m = context.createMarshaller();
            //Preparando el formato del archivo XML    
            m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            //Realiza la conversion a XML
            m.marshal(princ, new File("uppaal.xml"));
            
        } catch (JAXBException ex) {
    //        Logger.getLogger(LectorXPDL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}