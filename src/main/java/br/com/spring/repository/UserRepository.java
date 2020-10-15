package br.com.spring.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.spring.domain.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

	@Query("select from User where email = ?1 and password = ?2")
	public Optional<User> logar(String email, String senha);
	
	public User getByName(String valor);
}
