package com.StudentTeacherPortal.victoria.geykhman.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Teacher")
public class Teacher {
	
	private long id;
	private String userId;
	private String password;
	private String firstName;
	private String lastName;
	private String email;
	private String phone;
	private String address;
	private String city;
	private String state;
	private String zipcode;
	private String title;
	private Date dateOfHire;

	
	public Teacher() {
		super();
	}
	
	public Teacher(String userId, String password, String firstName, String lastName,	String email, String phone, 
			String address,	String city, String state, String zipcode, String title, Date dateOfHire) {
		
		super();
		
		this.userId = userId;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phone = phone;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
		this.title = title;
		this.dateOfHire = dateOfHire;
		
	}


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}

	@Column(name = "user_id", nullable = false, unique = true)
	public String getUserId() {
		return userId;
	}


	public void setUserId(String userId) {
		this.userId = userId;
	}

	@Column(name = "password", nullable = false)
	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}

	@Column(name = "first_name", nullable = false)
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Column(name = "last_name", nullable = false)
	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Column(name = "email", nullable = false, unique = true)
	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "phone")
	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	@Column(name = "address" )
	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}

	@Column(name = "city" )
	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}

	@Column(name = "state" )
	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}

	@Column(name = "zipcode" )
	public String getZipcode() {
		return zipcode;
	}


	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	@Column(name = "title" )
	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}

	@Column(name = "date_of_hire" )
	public Date getDateOfHire() {
		return dateOfHire;
	}


	public void setDateOfHire(Date dateOfHire) {
		this.dateOfHire = dateOfHire;
	}
	
	
	
}