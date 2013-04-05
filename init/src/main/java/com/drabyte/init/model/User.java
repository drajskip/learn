package com.drabyte.init.model;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.google.common.collect.Lists;

@Entity
public class User extends EntityBase implements UserDetails{

	@Column
	private String password;

	@Column(nullable = false,length = 20, unique = true)
	private String username;

	@Column
	private String lastName;

	@Column
	private String firstName;


	private static final long serialVersionUID = 1L;


	@Override
	public String toString() {
		return "User[id:"+getId()+" userName:"+username+"]";
	}

	public Collection<? extends GrantedAuthority> getAuthorities() {
		return Lists.newArrayList(new SimpleGrantedAuthority("ROLE_USER"));
	}

	public String getPassword() {
		return password;
	}

	public String getUsername() {
		// TODO Auto-generated method stub
		return username;
	}

	public boolean isAccountNonExpired() {
		return true;
	}

	public boolean isAccountNonLocked() {
		return true;
	}

	public boolean isCredentialsNonExpired() {
		return true;
	}

	public boolean isEnabled() {
		return true;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setUsername(String username) {
		this.username = username;
	}


	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

}
