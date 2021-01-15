package com.example.restservice.model;

//package com.grokonez.datetimerestapi.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "datetimemodel")
public class DateTimeModel {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
  
    @Column
    @Temporal(TemporalType.TIMESTAMP)
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date datetime;
   
    
    public DateTimeModel() {}
    
    public DateTimeModel( Date datetime) {
    	
    	this.datetime = datetime;
    	
    }
    
    
    // Getter/Setter datetime
    public void setDatetime(Date datetime) {
    	this.datetime = datetime;
    }
    
    public Date getDatetime() {
    	return this.datetime;
    }
    
  
}