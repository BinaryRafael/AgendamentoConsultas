package org.example.repositories.cadastro.pessoa;

import org.example.models.cadastro.pessoa.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.UUID;

@Repository
public interface IEndereco extends JpaRepository<Endereco, UUID> {
}
