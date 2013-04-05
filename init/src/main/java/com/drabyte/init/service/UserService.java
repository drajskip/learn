package com.drabyte.init.service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.drabyte.init.model.User;
import com.drabyte.init.repository.UserRepository;

@Repository("userService")
@Transactional
public class UserService implements UserDetailsService {

	@PersistenceContext
	EntityManager em;

	@Autowired
	UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String username)
			throws UsernameNotFoundException {
		User result =  userRepository.findByUsername(username);
		if (result == null) {
			throw new UsernameNotFoundException("Cannot find User with name username");
		}
		return result;
	}

}
