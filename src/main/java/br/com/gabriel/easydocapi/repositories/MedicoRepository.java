package br.com.gabriel.easydocapi.repositories;

import br.com.gabriel.easydocapi.models.Medico;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MedicoRepository extends JpaRepository<Medico, Long> {
    Optional<Medico> findByEmail(String email);
}
