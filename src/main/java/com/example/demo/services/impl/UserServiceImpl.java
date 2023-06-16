package com.example.demo.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.entities.User;
import com.example.demo.payloads.UserDto;
import com.example.demo.repository.UserRepo;
import com.example.demo.services.UserService;

public class UserServiceImpl implements UserService {
	@Autowired
	private UserRepo repo;
	
	
	@Override
	public UserDto createUser(UserDto userDto) {
	     User user = this.dtoToUser(userDto);
		User savedUser= repo.save(user);
		return this.userToDto(savedUser);
	}

	@Override
	public UserDto updateUser(UserDto user, Integer UserId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserDto getUserById(Integer userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UserDto> getAllUser() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteUser(Integer userId) {
		// TODO Auto-generated method stub

	}
	
	public User dtoToUser(UserDto userDto) {
		User user= new User();
		user.setId(userDto.getId());
		user.setName(userDto.getName());
		user.setEmail(userDto.getEmail());
		user.setPassword(userDto.getPassword());
		user.setAbout(userDto.getAbout());
		
		return user;
		
	}
	
	   public UserDto userToDto(User user) {
		   UserDto userDto = new UserDto();
		   userDto.setId(user.getId());
		   userDto.setName(user.getName());
		   userDto.setEmail(user.getEmail());
		   userDto.setPassword(user.getPassword());
		   userDto.setAbout(user.getAbout());
	    
		   return userDto;
  	}
	
	

}
