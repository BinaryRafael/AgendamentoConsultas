package org.example.repositories.cadastro.pessoa;

import org.example.models.cadastro.pessoa.Email;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.UUID;

@Repository
public interface IEmail extends JpaRepository<Email, UUID> {
}
