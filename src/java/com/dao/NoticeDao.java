/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.dao;

import com.model.NoticeModel;
import com.util.HibernateUtil;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author VK
 */
public class NoticeDao {
    public boolean saveMsg(NoticeModel nm){
        
        Session session=HibernateUtil.getSessionFactory().openSession();
        Transaction t=session.getTransaction();
        try {
            
            t.begin();
            session.save(nm);
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
    
     public List<NoticeModel> getAlldata(){
        
        Session session=HibernateUtil.getSessionFactory().openSession();
        Transaction tx=session.beginTransaction();
        
        try {
            
            Query query=session.createQuery("FROM NoticeModel");
            List<NoticeModel> user=query.list();
            return user;
            
        } catch (Exception e) {
             e.printStackTrace();
            tx.rollback();
        }finally{
        session.close();
        }
      
        return null;
    
    }
    
    public NoticeModel getByid(Long id){
          
              Session session=HibernateUtil.getSessionFactory().openSession();
        Transaction tx=session.beginTransaction();
          try {
              
              Query query=session.createQuery("FROM NoticeModel WHERE id=:id");
              query.setParameter("id", id);
              NoticeModel fdta=(NoticeModel) query.uniqueResult();
              return fdta;
              
          } catch (Exception e) {
              e.printStackTrace();
              tx.rollback();
          }finally{
          session.close();
          }
          
          
        return null;
           
      }
    
    public boolean deleteMsg(NoticeModel am){
        
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
