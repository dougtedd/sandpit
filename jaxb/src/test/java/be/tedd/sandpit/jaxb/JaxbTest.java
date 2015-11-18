package be.tedd.sandpit.jaxb;


import be.tedd.sandpit.jaxb.shiporder.ObjectFactory;
import be.tedd.sandpit.jaxb.shiporder.Shiporder;
import org.junit.Assert;
import org.junit.Test;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.StringWriter;


/**
 */
public class JaxbTest {

    @Test
    public void testMarshall() throws Exception {
        // Build an order
        ObjectFactory factory = new ObjectFactory();
        Shiporder shiporder = factory.createShiporder();
        shiporder.setOrderid("ORDER-ID");

        // Marshall the object
        JAXBContext jaxbContext = JAXBContext.newInstance(ObjectFactory.class);
        Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
        jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        StringWriter sw = new StringWriter();
        jaxbMarshaller.marshal(shiporder, sw);

        // Verify the output
        String xmlString = sw.toString();
        System.out.println(xmlString);
        Assert.assertTrue(xmlString.contains("orderid=\"ORDER-ID\""));
    }

}
