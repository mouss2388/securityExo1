package com.example.myreadinglist.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.example.myreadinglist.metier.Role;

public interface RoleRepository extends PagingAndSortingRepository<Role, Integer> {

}
