package com.example.restservice.service;

import java.util.Date;
import java.util.List;

import javax.persistence.GeneratedValue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.example.restservice.dao.VisitorDAO;
import com.example.restservice.model.Visitor;
@Service

public class VisitorServiceImpl implements VisitorService {
	@GeneratedValue
	@Autowired
	private VisitorDAO visitorDAO;
   @Transactional

	@Override
	public List<Visitor> get() {
		
	   return visitorDAO.get();
	}
   @Transactional
  @Override
   public Visitor get(long id) {
	   return visitorDAO.get(id);
   }
    @Transactional
	@Override
	public void save(Visitor visitor) {
		visitorDAO.save(visitor);
		
	}

	@Override
	public void delete(long id) {
		visitorDAO.delete(id);
		
	}
	@Override
	public List<Visitor> getAllUsers(Date dateTime) {
		 return visitorDAO.getAllUsers(dateTime);
		
	}

}
