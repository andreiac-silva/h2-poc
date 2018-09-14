package com.h2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.h2.entity.Candidate;
import com.h2.service.CandidateService;

@RestController
@RequestMapping("/candidates")
public class CandidateController {

	@Autowired
	private CandidateService candidateService;

	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Candidate>> findByName(@RequestParam(value = "name", required = false) String name) {
		return ResponseEntity.ok(candidateService.findByName(name));
	}
}
