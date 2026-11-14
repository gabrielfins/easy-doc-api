package br.com.gabriel.easydocapi.repositories;

import br.com.gabriel.easydocapi.models.Hospital;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface HospitalRepository extends JpaRepository<Hospital, Long>{
    Optional<Hospital> findByEmail(String email);
}

