package com.example.restservice.service;
import java.util.Date;
import java.util.List;
import com.example.restservice.model.DateTimeModel;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
public interface DateTimeRepo extends CrudRepository<DateTimeModel, Long>{
	
    @Query("select d from DateTimeModel d where d.datetime = :datetime")
    List<DateTimeModel> findAllWithDatetimeOn(
    		@Param("datetime") Date datetime);
}