
package service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the service package. 
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

    private final static QName _FindcirclrareaResponse_QNAME = new QName("http://services/", "findcirclrareaResponse");
    private final static QName _Findcirclrarea_QNAME = new QName("http://services/", "findcirclrarea");
    private final static QName _CallinecircleResponse_QNAME = new QName("http://services/", "callinecircleResponse");
    private final static QName _Callinecircle_QNAME = new QName("http://services/", "callinecircle");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Callinecircle }
     * 
     */
    public Callinecircle createCallinecircle() {
        return new Callinecircle();
    }

    /**
     * Create an instance of {@link FindcirclrareaResponse }
     * 
     */
    public FindcirclrareaResponse createFindcirclrareaResponse() {
        return new FindcirclrareaResponse();
    }

    /**
     * Create an instance of {@link Findcirclrarea }
     * 
     */
    public Findcirclrarea createFindcirclrarea() {
        return new Findcirclrarea();
    }

    /**
     * Create an instance of {@link CallinecircleResponse }
     * 
     */
    public CallinecircleResponse createCallinecircleResponse() {
        return new CallinecircleResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindcirclrareaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "findcirclrareaResponse")
    public JAXBElement<FindcirclrareaResponse> createFindcirclrareaResponse(FindcirclrareaResponse value) {
        return new JAXBElement<FindcirclrareaResponse>(_FindcirclrareaResponse_QNAME, FindcirclrareaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Findcirclrarea }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "findcirclrarea")
    public JAXBElement<Findcirclrarea> createFindcirclrarea(Findcirclrarea value) {
        return new JAXBElement<Findcirclrarea>(_Findcirclrarea_QNAME, Findcirclrarea.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CallinecircleResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "callinecircleResponse")
    public JAXBElement<CallinecircleResponse> createCallinecircleResponse(CallinecircleResponse value) {
        return new JAXBElement<CallinecircleResponse>(_CallinecircleResponse_QNAME, CallinecircleResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Callinecircle }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "callinecircle")
    public JAXBElement<Callinecircle> createCallinecircle(Callinecircle value) {
        return new JAXBElement<Callinecircle>(_Callinecircle_QNAME, Callinecircle.class, null, value);
    }

}
