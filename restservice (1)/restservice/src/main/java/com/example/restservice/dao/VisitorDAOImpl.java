package com.example.restservice.dao;
import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.example.restservice.model.Visitor;
@Repository("visitorDao")
public class VisitorDAOImpl implements VisitorDAO {
	@Autowired
    private EntityManager entitymanager;
	@Override
	public List<Visitor> get() {
		Session currentsession=entitymanager.unwrap(Session.class);
		Query<Visitor> query=currentsession.createQuery("from Visitor", Visitor.class);
		List<Visitor> list=query.getResultList();
		return list;
		
	}
@Override
	public Visitor get(long id) {
		Session currentsession=entitymanager.unwrap(Session.class);
        Visitor visitorobj=currentsession.get(Visitor.class, id);
       //return employeeobj;
        System.out.println("User has been Visited:");
		return visitorobj;
	}

	@Override
	public void save(Visitor visitor) {
		Session currentSession=entitymanager.unwrap(Session.class);
     	currentSession.saveOrUpdate(visitor);
		
	}

	@Override
	public void delete(long id) {
		Session currentsession=entitymanager.unwrap(Session.class);
	    Visitor employeeObj=currentsession.get(Visitor.class, id);
	    currentsession.delete(employeeObj);
	
		}
    @SuppressWarnings("unchecked")
	@Override
	public List<Visitor> getAllUsers(Date dateTime) {
		Session currentsession=entitymanager.unwrap(Session.class);
         Visitor visitorobj= currentsession.get(Visitor.class, dateTime);
         return (List<Visitor>) visitorobj;
	}

}
