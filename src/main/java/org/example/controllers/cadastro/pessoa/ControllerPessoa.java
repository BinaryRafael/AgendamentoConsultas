package org.example.controllers.cadastro.pessoa;

import org.example.dtos.cadastro.pessoa.DtoPessoa;
import org.example.models.cadastro.pessoa.ModelPessoa;
import org.example.services.ServicePessoa;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/cadastro/pessoa")
public class ControllerPessoa {

    final ServicePessoa servicePessoa;

    public ControllerPessoa(ServicePessoa sPessoa) {
        this.servicePessoa = sPessoa;
    }

    @PostMapping
    public ResponseEntity<Object> savePessoa(@RequestBody @Valid DtoPessoa dtoPessoa){

        if (servicePessoa.existsByNumeroRG(dtoPessoa.getNumeroRG())){
            return ResponseEntity.status(HttpStatus.CONFLICT).body("RG Já existe cadastrado.");
        }

        if (servicePessoa.existsByNumeroCpf(dtoPessoa.getNumeroCpf())){
            return ResponseEntity.status(HttpStatus.CONFLICT).body("CPF Já existe cadastrado.");
        }

        ModelPessoa mPessoa = new ModelPessoa();
        BeanUtils.copyProperties(dtoPessoa, mPessoa);
        return ResponseEntity.status(HttpStatus.CREATED).body(servicePessoa.save(mPessoa));
    }

    @GetMapping
    public ResponseEntity<List<ModelPessoa>> getAllPessoas(){
        return ResponseEntity.status(HttpStatus.OK).body(servicePessoa.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> getOneParkingSpot(@PathVariable(value = "id") UUID id){
        Optional<ModelPessoa> parkingSpotModelOptional = servicePessoa.findById(id);
        if (!parkingSpotModelOptional.isPresent()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Parking Spot not found.");
        }
        return ResponseEntity.status(HttpStatus.OK).body(parkingSpotModelOptional.get());
    }


}
