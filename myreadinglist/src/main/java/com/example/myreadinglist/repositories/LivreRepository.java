package com.example.myreadinglist.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.example.myreadinglist.metier.Livre;

public interface LivreRepository extends PagingAndSortingRepository<Livre, Integer> {

}