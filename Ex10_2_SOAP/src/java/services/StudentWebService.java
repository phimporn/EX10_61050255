/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Resource;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.resource.NotSupportedException;
import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.RollbackException;
import javax.transaction.SystemException;
import model.Student;

/**
 *
 * @author Phimporn
 */
@WebService(serviceName = "StudentWebService")
public class StudentWebService {

    @PersistenceContext(unitName = "Ex10_2_SOAPPU")
    private EntityManager em;
    @Resource
    private javax.transaction.UserTransaction utx;


  

    /**
     * Web service operation
     */
    @WebMethod(operationName = "findStudentById")
    public Student findStudentById(@WebParam(name = "id") int id) {
       Student studentfind = em.find(Student.class, id);
        return studentfind;
    }


    /**
     * Web service operation
     */
    @WebMethod(operationName = "insert")
    public String insert(@WebParam(name = "id") Student stu) {
        
       try{
           utx.begin();
           em.persist(stu);
           utx.commit();
       }catch(IllegalStateException | SecurityException | HeuristicMixedException | HeuristicRollbackException | javax.transaction.NotSupportedException | RollbackException | SystemException e){
           System.out.println(e.getMessage());
       }
        return "insert success";
    }

    /**
     * Web service operation
     * @param id
     * @return 
     */
    @WebMethod(operationName = "delete")
    public String delete(@WebParam(name = "id") int id) {
       try{
            utx.begin();
            Student target = em.find(Student.class, id);
            em.remove(target);
            utx.commit();
       }catch(IllegalStateException | SecurityException | HeuristicMixedException | HeuristicRollbackException | javax.transaction.NotSupportedException | RollbackException | SystemException e){
            System.out.println(e.getMessage());
       }
        return "delete success";
    }

    /**
     * Web service operation
     * @param stu
     * @return 
     * @throws javax.transaction.RollbackException
     * @throws javax.transaction.HeuristicMixedException
     * @throws javax.transaction.HeuristicRollbackException
     * @throws javax.transaction.SystemException
     * @throws javax.transaction.NotSupportedException
     */
    @WebMethod(operationName = "update")
    public String update(@WebParam(name = "student") Student stu) throws RollbackException, HeuristicMixedException, HeuristicRollbackException, SystemException, javax.transaction.NotSupportedException {
         try {
            utx.begin();
            Student target = em.find(Student.class, stu.getId());
            if (target == null) {
                return "fail";
            }
            target.setName(stu.getName());
            target.setGpa(stu.getGpa());
            em.persist(target);
            utx.commit();
        } catch (SystemException | RollbackException | HeuristicMixedException | HeuristicRollbackException | SecurityException | IllegalStateException ex) {
            Logger.getLogger(StudentWebService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "Update Success";
    }

    }
   
   
   
    
    
    

 
    
   
  

    /**
     * Web service operation
     */
    
    
    

    
    /**
     * This is a sample web service operation
     */
   
