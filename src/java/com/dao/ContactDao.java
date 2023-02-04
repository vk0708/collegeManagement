/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.dao;

import com.model.ContactModel;
import com.util.HibernateUtil;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class ContactDao {
    public boolean saveMsg(ContactModel cm){
        
        Session session=HibernateUtil.getSessionFactory().openSession();
        Transaction t=session.getTransaction();
        try {
            
            t.begin();
            session.save(cm);
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
    
     public List<ContactModel> getAlldata(){
        
        Session session=HibernateUtil.getSessionFactory().openSession();
        Transaction tx=session.beginTransaction();
        
        try {
            
            Query query=session.createQuery("FROM ContactModel");
            List<ContactModel> user=query.list();
            return user;
            
        } catch (Exception e) {
             e.printStackTrace();
            tx.rollback();
        }finally{
        session.close();
        }
      
        return null;
    
    }
    
    public ContactModel getByid(Long id){
          
              Session session=HibernateUtil.getSessionFactory().openSession();
        Transaction tx=session.beginTransaction();
          try {
              
              Query query=session.createQuery("FROM ContactModel WHERE id=:id");
              query.setParameter("id", id);
              ContactModel fdta=(ContactModel) query.uniqueResult();
              return fdta;
              
          } catch (Exception e) {
              e.printStackTrace();
              tx.rollback();
          }finally{
          session.close();
          }
          
          
        return null;
           
      }
    
    public boolean deleteMsg(ContactModel am){
        
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
}
