/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex10_2_client;

import service.HeuristicMixedException_Exception;
import service.HeuristicRollbackException_Exception;
import service.NotSupportedException_Exception;
import service.RollbackException_Exception;
import service.Student;
import service.SystemException_Exception;

/**
 *
 * @author Phimporn
 */
public class Ex10_2_client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws HeuristicMixedException_Exception, HeuristicRollbackException_Exception, NotSupportedException_Exception, RollbackException_Exception, SystemException_Exception {
        Student findByid = findStudentById(1);
        System.out.println(findByid.getName());
        System.out.println(findByid.getGpa());
        
//        Student stu = new Student();
//        stu.setId(1);
//        stu.setName("MK");
//        stu.setGpa(4.00);
//        String insertReponse = insert(stu);
//        System.out.println(insertReponse);
//        
        
//        String deleteReponse = delete(3);
//        System.out.println(deleteReponse);
        
        
        findByid.setName("save");
        update(findByid);

        
    }

    private static String delete(int id) {
        service.StudentWebService_Service service = new service.StudentWebService_Service();
        service.StudentWebService port = service.getStudentWebServicePort();
        return port.delete(id);
    }

    private static Student findStudentById(int id) {
        service.StudentWebService_Service service = new service.StudentWebService_Service();
        service.StudentWebService port = service.getStudentWebServicePort();
        return port.findStudentById(id);
    }

    private static String insert(service.Student student) {
        service.StudentWebService_Service service = new service.StudentWebService_Service();
        service.StudentWebService port = service.getStudentWebServicePort();
        return port.insert(student);
    }

    private static String update(service.Student student) throws HeuristicMixedException_Exception, HeuristicRollbackException_Exception, NotSupportedException_Exception, RollbackException_Exception, SystemException_Exception {
        service.StudentWebService_Service service = new service.StudentWebService_Service();
        service.StudentWebService port = service.getStudentWebServicePort();
        return port.update(student);
    }

  
    
    
    
}
