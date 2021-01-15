package com.example.restservice.model;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name="tbl_visitors")

public class Visitor{
	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	private long contact;
	@Column
	private String name;
	@Column
	@Temporal(TemporalType.DATE)
    @JsonFormat(pattern="yyyy-MM-dd")
	private Date Visiting_date;
	@Column
	private String flat_number;
	@Column
	private boolean is_exited;
	public long getContact() {
		return contact;
	}
	public void setContact(long contact) {
		this.contact = contact;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getVisiting_date() {
		return Visiting_date;
	}
	public void setVisiting_date(Date visiting_date) {
		Visiting_date = visiting_date;
	}
	public String getFlat_number() {
		return flat_number;
	}
	public void setFlat_number(String flat_number) {
		this.flat_number = flat_number;
	}
	public boolean isIs_exited() {
		return is_exited;
	}
	public void setIs_exited(boolean is_exited) {
		this.is_exited = is_exited;
	}
	@Override
	public String toString() {
		return "Visitor [contact=" + contact + ", name=" + name + ", Visiting_date=" + Visiting_date + ", flat_number="
				+ flat_number + ", is_exited=" + is_exited + "]";
	}
	
	
}



