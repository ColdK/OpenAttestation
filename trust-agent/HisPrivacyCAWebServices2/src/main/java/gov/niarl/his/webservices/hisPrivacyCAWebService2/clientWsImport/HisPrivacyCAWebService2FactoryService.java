
package gov.niarl.his.webservices.hisPrivacyCAWebServices2.clientWsImport;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import javax.xml.ws.wsaddressing.W3CEndpointReference;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.7-b01-
 * Generated source version: 2.1
 * 
 */
@WebService(name = "HisPrivacyCAWebService2FactoryService", targetNamespace = "http://server.hisPrivacyCAWebService2.webservices.his.niarl.gov/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface HisPrivacyCAWebService2FactoryService {


    /**
     * 
     * @return
     *     returns javax.xml.ws.wsaddressing.W3CEndpointReference
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getHisPrivacyCAWebService2", targetNamespace = "http://server.hisPrivacyCAWebService2.webservices.his.niarl.gov/", className = "gov.niarl.his.webservices.hisPrivacyCAWebServices2.clientWsImport.GetHisPrivacyCAWebService2")
    @ResponseWrapper(localName = "getHisPrivacyCAWebService2Response", targetNamespace = "http://server.hisPrivacyCAWebService2.webservices.his.niarl.gov/", className = "gov.niarl.his.webservices.hisPrivacyCAWebServices2.clientWsImport.GetHisPrivacyCAWebService2Response")
    public W3CEndpointReference getHisPrivacyCAWebService2();

}
