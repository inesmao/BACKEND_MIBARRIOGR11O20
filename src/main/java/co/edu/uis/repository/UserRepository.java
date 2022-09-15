package co.edu.uis.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.edu.uis.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	public User findByUsername(String username);
}
