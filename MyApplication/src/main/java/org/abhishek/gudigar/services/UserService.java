package org.abhishek.gudigar.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.abhishek.gudigar.Repository.UserRepository;
import org.abhishek.gudigar.model.User;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class UserService {

	private final UserRepository userRepository;
	
	public UserService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	public void saveMyUser(User user) {
		userRepository.save(user);
	}
	
	public List<User> showAllUsers() {
		List<User> users = new ArrayList<User>();
		for(User user: userRepository.findAll()){
			users.add(user);
		}
		return users;
	}
	
	public void deleteUser(int id) {
		userRepository.deleteById(id);
	}
	
	public Optional<User> updateUser(int id) {
		return userRepository.findById(id);
	}
	
	public User findByUsernameAndPassword(String username, String password) {
		return userRepository.findByUsernameAndPassword(username, password);
	}
}
