package com.example;


import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;


public class SignupForm {

	@NotEmpty(message="ユーザ名を入力してください。")
    private String username;

    @Size(min=8, max=255)
    private String password;
   
    @Pattern(regexp = "^([\\w])+([\\w\\._-])*\\@([\\w])+([\\w\\._-])*\\.([a-zA-Z])+$", message="メールアドレスを入力してください。")
    private String mailAddress;

    @Pattern(regexp="^[0-9]{10,11}$", message="電話番号を正しく入力してください")
	private String phoneNumber;
    
    @Pattern(regexp = "^\\d{3}\\-?\\d{4}$", message="郵便番号を正しく入力してください")
    private String postalCode;
    
    @NotEmpty(message="住所を入力してください")
    private String address;
    
    private int birthday;

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

	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getPostalCode() {
		return postalCode;
	}
	
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public int getBirthday() {
		return birthday;
	}
	
	public void setBirthday(int birthday) {
		this.birthday = birthday;
	}
}