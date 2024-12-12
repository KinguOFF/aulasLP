/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.Clientes;
import bean.Usuarios;
import java.util.ArrayList;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author u09285835112
 */
public class ClientesDAO extends DAO_Abstract{
    
    @Override
    public void insert(Object objeto) {
    session.beginTransaction();
    session.save(objeto);
    session.beginTransaction().commit();
}

    @Override
    public void update(Object objeto) {
    session.beginTransaction();
    session.flush();
    session.clear();
    session.update(objeto);
    session.beginTransaction().commit();   
    }

    @Override
    public void delete(Object objeto) {
    session.beginTransaction();
    session.flush();
    session.clear();
    session.delete(objeto);
    session.beginTransaction().commit();    
    }

    @Override
    public Object list(int codigo) {
    session.beginTransaction();
    Criteria criteria = session.createCriteria(Clientes.class);
    criteria.add(Restrictions.eq("idclientes", codigo));
    ArrayList lista = (ArrayList) criteria.list();
    session.getTransaction().commit();
    return lista.get(0);    
    }

    @Override
    public ArrayList listAll() {
    session.beginTransaction();
    Criteria criteria = session.createCriteria(Clientes.class);
    ArrayList lista = (ArrayList) criteria.list();
    session.getTransaction().commit();
    return lista;
    }
}
