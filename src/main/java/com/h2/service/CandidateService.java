package com.h2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.h2.entity.Candidate;
import com.h2.repository.CandidateRepository;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CandidateService {

	@Autowired
	private CandidateRepository candidateRepository;

	public List<Candidate> findByName(String name) {
		return candidateRepository.findByNameContainingIgnoreCase(name);
	}

	public List<Candidate> findByNameAndEmail(String name, String email) {
		List<Candidate> listByNameAndEmail = candidateRepository.findByNameAndEmail(name, email);
		if (listByNameAndEmail.isEmpty()) {
			Candidate newCandidate = new Candidate();
			newCandidate.setName("Renata");
			newCandidate.setEmail("renata@gmail.com");
			listByNameAndEmail.add(newCandidate);
			return listByNameAndEmail;
		}
		return listByNameAndEmail;
	}

	public List<Candidate> findAll() {
		return (List<Candidate>) candidateRepository.findAll();
	}

	public void save(Candidate candidate) {
		candidateRepository.save(candidate);
	}
}
