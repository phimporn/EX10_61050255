/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex10_1_client;

/**
 *
 * @author Phimporn
 */
public class Ex10_1_client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("calcirclearea = " + findcirclrarea(4));
        System.out.println("callinecircle = " + callinecircle(4));
    }

    private static double callinecircle(double radius) {
        service.Calcircle_Service service = new service.Calcircle_Service();
        service.Calcircle port = service.getCalcirclePort();
        return port.callinecircle(radius);
    }

    private static double findcirclrarea(double radius) {
        service.Calcircle_Service service = new service.Calcircle_Service();
        service.Calcircle port = service.getCalcirclePort();
        return port.findcirclrarea(radius);
    }
    
    
    
}
