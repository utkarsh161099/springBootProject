package com.example.restservice.service;

import java.util.Date;
import java.util.List;

import com.example.restservice.model.Visitor;

public interface VisitorService {
	List<Visitor> get();
	Visitor get(long id);
	void save(Visitor visitor);
	void delete(long id);
	List<Visitor> getAllUsers(Date dateTime);

}
