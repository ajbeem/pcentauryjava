
package pcentaury.com.servicio;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the pcentaury.com.servicio package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Saludo_QNAME = new QName("http://servicio.com.pcentaury/", "saludo");
    private final static QName _SaludoResponse_QNAME = new QName("http://servicio.com.pcentaury/", "saludoResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: pcentaury.com.servicio
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Saludo }
     * 
     */
    public Saludo createSaludo() {
        return new Saludo();
    }

    /**
     * Create an instance of {@link SaludoResponse }
     * 
     */
    public SaludoResponse createSaludoResponse() {
        return new SaludoResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Saludo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio.com.pcentaury/", name = "saludo")
    public JAXBElement<Saludo> createSaludo(Saludo value) {
        return new JAXBElement<Saludo>(_Saludo_QNAME, Saludo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaludoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio.com.pcentaury/", name = "saludoResponse")
    public JAXBElement<SaludoResponse> createSaludoResponse(SaludoResponse value) {
        return new JAXBElement<SaludoResponse>(_SaludoResponse_QNAME, SaludoResponse.class, null, value);
    }

}
