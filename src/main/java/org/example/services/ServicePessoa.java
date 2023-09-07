package org.example.services;

import org.example.models.cadastro.pessoa.ModelPessoa;
import org.example.repositories.cadastro.pessoa.InterfacePessoa;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class ServicePessoa {

    final InterfacePessoa interfacePessoa;

    public ServicePessoa(InterfacePessoa iPessoa) {
        this.interfacePessoa = iPessoa;
    }

    @Transactional
    public ModelPessoa save(ModelPessoa mPessoa) {
        return interfacePessoa.save(mPessoa);
    }

    public boolean existsByNumeroRG(int numeroRG) {
        return interfacePessoa.existsByNumeroRG(numeroRG);
    }

    public boolean existsByNumeroCpf(String numeroCpf){
        return interfacePessoa.existsByNumeroCpf(numeroCpf);
    }

    public List<ModelPessoa> findAll() {
        return interfacePessoa.findAll();
    }

    public Optional<ModelPessoa> findById(UUID id) {
        return interfacePessoa.findById(id);
    }
}
