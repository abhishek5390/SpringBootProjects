package org.abhishek.gudigar.Repository;

import org.abhishek.gudigar.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {
	public User findByUsernameAndPassword(String username, String password);
}
