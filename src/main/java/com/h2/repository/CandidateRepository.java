package com.h2.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.h2.entity.Candidate;

@Repository
public interface CandidateRepository extends CrudRepository<Candidate, Long> {

	List<Candidate> findByNameContainingIgnoreCase(String name);
}
