package com.example;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;

@SuppressWarnings("deprecation")
public class SignupForm {

    @Pattern(regexp="^\\w{3,32}$", message="size must be between 3 and 32, each character must be alphanumeric or underscore (A-Za-z0-9_)")
    private String username;

    @Size(min=8, max=255)
    private String password;

    @Email
    @Size(min=3, max=255)
    private String mailAddress;
    
    @Size(min=3, max=255)
    private int phoneNumber;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMailAddress() {
        return mailAddress;
    }

    public void setMailAddress(String mailAddress) {
        this.mailAddress = mailAddress;
    }

	public int getPhoneNumber() {
		return phoneNumber;
	}
	
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

}