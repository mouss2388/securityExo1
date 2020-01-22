package com.example.myreadinglist.security;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.myreadinglist.metier.Lecteur;
import com.example.myreadinglist.repositories.LecteurRepository;
@Service
public class CustomUserDetailsService implements UserDetailsService {

	@Autowired
	private LecteurRepository lecteurRepository;
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		Optional<Lecteur> lecteur = lecteurRepository.findWithRoleByUsername(username);
		if(!lecteur.isPresent())
			throw new UsernameNotFoundException("login/password invalid");
		return new CustomUserDetails(lecteur.get());
	}

}
