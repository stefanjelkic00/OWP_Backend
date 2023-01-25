package com.example.OsnoveWebProgramiranja.services;

import org.springframework.stereotype.Service;

import com.example.OsnoveWebProgramiranja.dto.LoginDTO;
import com.example.OsnoveWebProgramiranja.dto.RegistrationDTO;
import com.example.OsnoveWebProgramiranja.dto.UserDTO;

@Service
public interface UserService {
	
		public UserDTO login(LoginDTO loginDTO) ;
		
		public void registration(RegistrationDTO registrationDTO) ; 
		
		public UserDTO editUser(UserDTO userDTO);

	
}
