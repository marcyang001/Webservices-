
package client;

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
 * JAX-WS RI 2.2.10
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "ResourceManagerImplService", targetNamespace = "http://server/", wsdlLocation = "http://localhost:8080/rm/service?wsdl")
public class ResourceManagerImplService
    extends Service
{

    private final static URL RESOURCEMANAGERIMPLSERVICE_WSDL_LOCATION;
    private final static WebServiceException RESOURCEMANAGERIMPLSERVICE_EXCEPTION;
    private final static QName RESOURCEMANAGERIMPLSERVICE_QNAME = new QName("http://server/", "ResourceManagerImplService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/rm/service?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        RESOURCEMANAGERIMPLSERVICE_WSDL_LOCATION = url;
        RESOURCEMANAGERIMPLSERVICE_EXCEPTION = e;
    }

    public ResourceManagerImplService() {
        super(__getWsdlLocation(), RESOURCEMANAGERIMPLSERVICE_QNAME);
    }

    public ResourceManagerImplService(WebServiceFeature... features) {
        super(__getWsdlLocation(), RESOURCEMANAGERIMPLSERVICE_QNAME, features);
    }

    public ResourceManagerImplService(URL wsdlLocation) {
        super(wsdlLocation, RESOURCEMANAGERIMPLSERVICE_QNAME);
    }

    public ResourceManagerImplService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, RESOURCEMANAGERIMPLSERVICE_QNAME, features);
    }

    public ResourceManagerImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ResourceManagerImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ResourceManager
     */
    @WebEndpoint(name = "ResourceManagerImplPort")
    public ResourceManager getResourceManagerImplPort() {
        return super.getPort(new QName("http://server/", "ResourceManagerImplPort"), ResourceManager.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ResourceManager
     */
    @WebEndpoint(name = "ResourceManagerImplPort")
    public ResourceManager getResourceManagerImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://server/", "ResourceManagerImplPort"), ResourceManager.class, features);
    }

    private static URL __getWsdlLocation() {
        if (RESOURCEMANAGERIMPLSERVICE_EXCEPTION!= null) {
            throw RESOURCEMANAGERIMPLSERVICE_EXCEPTION;
        }
        return RESOURCEMANAGERIMPLSERVICE_WSDL_LOCATION;
    }

}
