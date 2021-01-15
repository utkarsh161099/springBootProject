package com.example.restservice.dao;

import java.util.Date;
//import java.util.Date;
import java.util.List;

import com.example.restservice.model.Visitor;

public interface VisitorDAO {
	List<Visitor> get();
	Visitor get(long id);
	void save(Visitor visitor);
	void delete(long id);
	List<Visitor> getAllUsers(Date dateTime);


}
