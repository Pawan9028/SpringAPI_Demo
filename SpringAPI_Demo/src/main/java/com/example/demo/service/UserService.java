package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.UserRepository;
import com.example.demo.user.User;

@Service
public class UserService {
@Autowired
private UserRepository userRepository;

public List<User> getAllUsers(){
	return userRepository.findAll();	
}
public User getUserById(Long id) {
	return userRepository.findById(id).orElseThrow(() -> new RuntimeException("User not found"));
}
public User createUser(User user) {
	return userRepository.save(user);
}
public User updateUser(Long id, User userDetails) {
    User user = getUserById(id);
    user.setName(userDetails.getName());
    user.setEcity(userDetails.getEcity());
    return userRepository.save(user);
}

public void deleteUser(Long id) {
    userRepository.deleteById(id);
}

	
}
