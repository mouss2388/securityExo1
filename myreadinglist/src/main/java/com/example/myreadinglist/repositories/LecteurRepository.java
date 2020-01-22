package com.example.myreadinglist.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import com.example.myreadinglist.metier.Lecteur;

public interface LecteurRepository extends PagingAndSortingRepository<Lecteur, Integer> {

	@Query("select l from Lecteur l left join fetch l.roles where l.username=:username")
	Optional<Lecteur> findWithRoleByUsername(@Param("username") String username);
}
