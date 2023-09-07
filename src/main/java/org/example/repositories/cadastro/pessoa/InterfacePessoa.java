package org.example.repositories.cadastro.pessoa;

import org.example.models.cadastro.pessoa.ModelPessoa;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface InterfacePessoa extends JpaRepository<ModelPessoa, UUID> {

    boolean existsByNumeroRG(int numeroRG);
    boolean existsByNumeroCpf(String numeroCpf);

}
