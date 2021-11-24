/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Phimporn
 */
@WebService(serviceName = "Calcircle")
public class Calcircle {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "findcirclrarea")
    public double findcirclrarea(@WebParam(name = "radius") double radius) {
        double findcirclearea1 = 3.14*(radius*radius);
        return findcirclearea1;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "callinecircle")
    public double callinecircle(@WebParam(name = "radius") double radius) {
        double findLineCircle = 2*3.14*radius;
        return findLineCircle;
    }
    
    
    

    /**
     * Web service operation
     */
  

    /**
     * This is a sample web service operation
     */
  
}
