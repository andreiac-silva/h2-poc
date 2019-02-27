package com.h2.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.h2.entity.Candidate;

@Repository
public interface CandidateRepository extends CrudRepository<Candidate, Long> {

    List<Candidate> findByNameContainingIgnoreCase(String name);

    List<Candidate> findByNameAndEmail(String name, String email);

    List<Candidate> findByNameIn(List<String> names);

    @Query("FROM Candidate c WHERE c.id = :id")
    void jpqlQuery(@Param("id") Long id);

    @Query(nativeQuery = true, value = "SELECT * FROM candidate c WHERE c.id = :id")
    void nativeQuery(@Param("id") Long id);
}
