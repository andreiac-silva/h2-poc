package com.h2.entity;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "candidate")
public class Candidate implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "cpf", unique = true, nullable = false)
	private String cpf;

	@Column(name = "email", nullable = false)
	private String email;

	@Column(name = "name")
	private String name;

	@Column(name = "date_birth", nullable = true)
	private LocalDate localDate;

	public Candidate() {
	}

	public Candidate(Long id, String cpf, String email, String name, LocalDate localDate) {
		this.id = id;
		this.cpf = cpf;
		this.email = email;
		this.name = name;
		this.localDate = localDate;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getLocalDate() {
		return localDate;
	}

	public void setLocalDate(LocalDate localDate) {
		this.localDate = localDate;
	}
}
