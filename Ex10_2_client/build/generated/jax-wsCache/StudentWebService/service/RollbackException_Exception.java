
package service;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "RollbackException", targetNamespace = "http://services/")
public class RollbackException_Exception
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private RollbackException faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public RollbackException_Exception(String message, RollbackException faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public RollbackException_Exception(String message, RollbackException faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: service.RollbackException
     */
    public RollbackException getFaultInfo() {
        return faultInfo;
    }

}