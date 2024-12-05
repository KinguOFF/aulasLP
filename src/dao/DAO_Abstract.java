/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;


import org.hibernate.Session;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.SessionFactory;
/**
 *
 * @author u09285835112
 */

public abstract class DAO_Abstract {
    
public Session session;
   
public DAO_Abstract(){
    SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
    session = sessionFactory.openSession();
}

public abstract void insert(Object objeto);
public abstract void update(Object objeto);
public abstract void delete(Object objeto);
public abstract Object list(int codigo);
public abstract List listAll();

}
