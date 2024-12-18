package com.hello.app.entity;

import java.util.Objects;

public class User{
	
	private String username;
	private String password;
	private String contactNumber;
	private String role;
	private Double accountBalance;
	
	
	public User(String username, String password, String contactNumber, String role, Double accountBalance){
		this.username = username;
		this.password = password;
		this.contactNumber = contactNumber;
		this.role = role;
		this.accountBalance = accountBalance;
	}
	
	
	public String getUsername(){
		return username;
	}
	public void setUsername(String username){
		this.username = username;
	}
	public String getPassword(){
		return password;
	}
	public void setPassword(String password){
		this.password = password;
	}
	public String getContactNumber(){
		return contactNumber;
	}
	public void setContactNumber(String contactNumber){
		this.contactNumber = contactNumber;
	}
	public String getRole(){
		return role;
	}
	public void setRole(String Role){
		this.role = role;
	}
	public Double getAccountBalance(){
		return accountBalance;
	}
	public void setAccountBalance(Double accountBalance){
		this.accountBalance = accountBalance;
	}

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("User{");
        sb.append("username=").append(username);
        sb.append(", password=").append(password);
        sb.append(", contactNumber=").append(contactNumber);
        sb.append(", role=").append(role);
        sb.append(", accountBalance=").append(accountBalance);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.username);
        hash = 29 * hash + Objects.hashCode(this.password);
        hash = 29 * hash + Objects.hashCode(this.contactNumber);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final User other = (User) obj;
        if (!Objects.equals(this.username, other.username)) {
            return false;
        }
        if (!Objects.equals(this.password, other.password)) {
            return false;
        }
        return Objects.equals(this.contactNumber, other.contactNumber);
    }
	
	
}