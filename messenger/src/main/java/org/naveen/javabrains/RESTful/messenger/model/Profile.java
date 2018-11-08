package org.naveen.javabrains.RESTful.messenger.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Profile {
    private long id;
    private String profilename;
    private String Firstname;
    private String Lastname;
    private Date created;
    
    public Profile(){
    	
    }
    
    public Profile(Long id, String profilename, String firstname, String lastname) {
    	
		this.id = id;
		this.profilename = profilename;
		Firstname = firstname;
		Lastname = lastname;
		
	}
    
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getProfilename() {
		return profilename;
	}
	public void setProfilename(String profilename) {
		this.profilename = profilename;
	}
	public String getFirstname() {
		return Firstname;
	}
	public void setFirstname(String firstname) {
		Firstname = firstname;
	}
	public String getLastname() {
		return Lastname;
	}
	public void setLastname(String lastname) {
		Lastname = lastname;
	}
	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}
	
    
    
}
