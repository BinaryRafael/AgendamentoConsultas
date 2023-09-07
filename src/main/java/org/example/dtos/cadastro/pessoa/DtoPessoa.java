package org.example.dtos.cadastro.pessoa;

import org.hibernate.validator.constraints.br.CPF;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class DtoPessoa {

    @NotBlank
    @Size(max = 255)
    private String nome;

    @NotBlank
    @Size(max = 255)
    private String sobreNome;

    @NotBlank
    @Size(max = 255)
    private String nacionalidade;

    @NotBlank
    @Size(max = 255)
    private String dataNascimento;

    @NotBlank
    @Size(max = 255)
    private String estadoCivil;

    @NotBlank
    @Size(max = 255)
    private String genero;

    @NotNull
    private int numeroRG;

    @NotBlank
    @Size(max = 255)
    private String orgaoExpedidor;

    @CPF
    private String numeroCpf;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getNumeroRG() {
        return numeroRG;
    }

    public void setNumeroRG(int numeroRG) {
        this.numeroRG = numeroRG;
    }

    public String getOrgaoExpedidor() {
        return orgaoExpedidor;
    }

    public void setOrgaoExpedidor(String orgaoExpedidor) {
        this.orgaoExpedidor = orgaoExpedidor;
    }

    public String getNumeroCpf() {
        return numeroCpf;
    }

    public void setNumeroCpf(String numeroCpf) {
        this.numeroCpf = numeroCpf;
    }
}
