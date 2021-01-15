package com.example.restservice;

import java.util.Calendar;
import java.util.TimeZone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyrestServiceApplication {

	public static void main(String[] args) {
		TimeZone tz = Calendar.getInstance().getTimeZone();
		System.out.println(tz.getID());
		SpringApplication.run(MyrestServiceApplication.class, args);
	}

}
