package com.grocery.service;

import java.util.List;

import com.grocery.dto.UserDTO;
import com.grocery.entity.User;

public interface UserService {
	public User registerUser(UserDTO userdto);
	
	public User loginUser(UserDTO userdto);
	
	
}
