package com.h2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.h2.entity.Candidate;
import com.h2.repository.CandidateRepository;

@Service
public class CandidateService {

	@Autowired
	private CandidateRepository candidateRepository;

	public List<Candidate> findByName(String name) {
		return candidateRepository.findByNameContainingIgnoreCase(name);
	}
}
