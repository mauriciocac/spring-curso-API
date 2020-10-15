package br.com.spring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.spring.domain.Request;
import br.com.spring.domain.enums.RequestState;

@Repository
public interface RequestRepository extends JpaRepository<Request, Long>{
	
	public List<Request> findAllByOwnerId(Long id);
	
	@Query("update Request set state = ?2 where id =?1")
	public Request updateStatus(Long id, RequestState state);
}
