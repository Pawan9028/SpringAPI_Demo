package com.example.demo.user;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity

public class User {
@Id
@GeneratedValue()
private Long Eid;
private String Ename;
private String Ecity;
public Object getName() {
	// TODO Auto-generated method stub
	return null;
}
public void setName(Object name) {
	// TODO Auto-generated method stub
	
}
public Object getEmail() {
	// TODO Auto-generated method stub
	return null;
}
public Object getEcity() {
	// TODO Auto-generated method stub
	return null;
}
public void setEcity(Object ecity2) {
	// TODO Auto-generated method stub
	
}


}
