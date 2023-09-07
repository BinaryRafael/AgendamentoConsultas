package org.example.repositories.cadastro.pessoa;

import org.example.models.cadastro.pessoa.Curso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.UUID;

@Repository
public interface ICurso extends JpaRepository<Curso, UUID> {
}
