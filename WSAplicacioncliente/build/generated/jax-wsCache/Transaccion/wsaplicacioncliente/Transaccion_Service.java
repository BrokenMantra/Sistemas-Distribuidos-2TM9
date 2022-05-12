
package wsaplicacioncliente;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.3
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "Transaccion", targetNamespace = "http://Transaccion.me.org/", wsdlLocation = "http://localhost:8080/Transaccion/Transaccion?wsdl")
public class Transaccion_Service
    extends Service
{

    private final static URL TRANSACCION_WSDL_LOCATION;
    private final static WebServiceException TRANSACCION_EXCEPTION;
    private final static QName TRANSACCION_QNAME = new QName("http://Transaccion.me.org/", "Transaccion");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/Transaccion/Transaccion?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        TRANSACCION_WSDL_LOCATION = url;
        TRANSACCION_EXCEPTION = e;
    }

    public Transaccion_Service() {
        super(__getWsdlLocation(), TRANSACCION_QNAME);
    }

    public Transaccion_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), TRANSACCION_QNAME, features);
    }

    public Transaccion_Service(URL wsdlLocation) {
        super(wsdlLocation, TRANSACCION_QNAME);
    }

    public Transaccion_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, TRANSACCION_QNAME, features);
    }

    public Transaccion_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Transaccion_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns Transaccion
     */
    @WebEndpoint(name = "TransaccionPort")
    public Transaccion getTransaccionPort() {
        return super.getPort(new QName("http://Transaccion.me.org/", "TransaccionPort"), Transaccion.class);
    }

    /**
     * 
     * @param features
     *     A list of {&#064;link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the &lt;code&gt;features&lt;/code&gt; parameter will have their default values.
     * @return
     *     returns Transaccion
     */
    @WebEndpoint(name = "TransaccionPort")
    public Transaccion getTransaccionPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://Transaccion.me.org/", "TransaccionPort"), Transaccion.class, features);
    }

    private static URL __getWsdlLocation() {
        if (TRANSACCION_EXCEPTION!= null) {
            throw TRANSACCION_EXCEPTION;
        }
        return TRANSACCION_WSDL_LOCATION;
    }

}