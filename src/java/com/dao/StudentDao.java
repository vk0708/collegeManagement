/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.dao;

import com.model.StudentModel;
import com.util.HibernateUtil;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class StudentDao {
    public boolean saveStud(StudentModel sm){
        
        Session session=HibernateUtil.getSessionFactory().openSession();
        Transaction t=session.getTransaction();
        try {
            
            t.begin();
            session.save(sm);
            t.commit();
            
            return true;
            
            
        } catch (Exception e) {
            e.printStackTrace();
            t.rollback();
            
        }finally{
        session.close();
        }
        
        return false;
    }
    
     public List<StudentModel> getAlldata(){
        
        Session session=HibernateUtil.getSessionFactory().openSession();
        Transaction tx=session.beginTransaction();
        
        try {
            
            Query query=session.createQuery("FROM StudentModel");
            List<StudentModel> user=query.list();
            return user;
            
        } catch (Exception e) {
             e.printStackTrace();
            tx.rollback();
        }finally{
        session.close();
        }
      
        return null;
    
    }
    
    public StudentModel getByid(Long id){
          
              Session session=HibernateUtil.getSessionFactory().openSession();
        Transaction tx=session.beginTransaction();
          try {
              
              Query query=session.createQuery("FROM StudentModel WHERE id=:id");
              query.setParameter("id", id);
              StudentModel fdta=(StudentModel) query.uniqueResult();
              return fdta;
              
          } catch (Exception e) {
              e.printStackTrace();
              tx.rollback();
          }finally{
          session.close();
          }
          
          
        return null;
           
      }
    
    public boolean updateStud(StudentModel am){
        
        Session session=HibernateUtil.getSessionFactory().openSession();
        Transaction t=session.getTransaction();
        try {
            
            t.begin();
            session.update(am);
            t.commit();
            
            return true;
            
            
        } catch (Exception e) {
            e.printStackTrace();
            t.rollback();
            
        }finally{
        session.close();
        }
        
        return false;
    }
       
       
         public boolean deleteStud(StudentModel am){
        
        Session session=HibernateUtil.getSessionFactory().openSession();
        Transaction t=session.getTransaction();
        try {
            
            t.begin();
            session.delete(am);
            t.commit();
            
            return true;
            
            
        } catch (Exception e) {
            e.printStackTrace();
            t.rollback();
            
        }finally{
        session.close();
        }
        
        return false;
    }
         
    public StudentModel StudentLogin(StudentModel sd){
    Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tt=session.getTransaction();
      StudentModel s=null;
        try {
            Query query=session.createQuery("FROM StudentModel WHERE email=:e and pass=:p");
            query.setParameter("e", sd.getEmail());
            query.setParameter("p", sd.getPass());

            s=(StudentModel) query.uniqueResult();
            System.out.println("s" +s);
            return s;
            
        } catch (Exception e) {
            e.getStackTrace();
        }finally{
        session.close();
        }
        return null;
    }
}
