package com.example.restservice.controller;
import java.util.Date;
import java.util.List;

import javax.persistence.GeneratedValue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.restservice.model.DateTimeModel;
import com.example.restservice.model.Visitor;
import com.example.restservice.service.DateTimeRepo;


@RestController
@RequestMapping("/api")
public class VisitorController {
	@Autowired
	private VisitorService visitorService;
	@Autowired
	DateTimeRepo dateTimeRepository;
	
     @GetMapping("/visitor")
	public List<Visitor> get(){
    return visitorService.get();
}    @GeneratedValue
     @PostMapping("/visitor")
     public Visitor save(@RequestBody Visitor visitorObj) {
		visitorService.save(visitorObj);;
    	 return visitorObj;
     }
     @GetMapping("/visitor/{id}")
     public Visitor get(@PathVariable String id)  {
    	
    	
   	 Visitor visitorObj=visitorService.get(Long.parseLong(id));
   	 if(visitorObj == null) {
  		 throw new RuntimeException("Not Visitors");
   	 }
    	
    	return visitorService.get(Long.parseLong(id));
 }
   @PutMapping("/visitor")
   public Visitor update(@RequestBody Visitor visitorObj) {
 	 visitorService.save(visitorObj);
 	 return visitorObj;
   } 
   
   @GetMapping("/vistor/getAllUsers")
   List<Visitor> getAllUsers(@RequestParam("date") @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss") Date dateTime) {
       return visitorService.getAllUsers(dateTime);
   }
   
   @GetMapping("/getallwithdatetimeOn")
	public List<DateTimeModel> getAllWithDatetimeBefore(
			@RequestParam("datetime") @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss ") Date datetime){
           return dateTimeRepository.findAllWithDatetimeOn(datetime);
	}
   
   @DeleteMapping("/visitor/{id}")
     public String delete(@PathVariable long id){
    visitorService.delete(id);
    return "Employee has been deleted with id: " +id;
    }
}

