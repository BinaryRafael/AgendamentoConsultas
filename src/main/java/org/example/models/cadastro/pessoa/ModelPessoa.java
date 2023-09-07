package org.example.models.cadastro.pessoa;

import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;

@Entity
@Table(name = "Pessoa")
@Inheritance(strategy = InheritanceType.JOINED)
public class ModelPessoa implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID idPessoa;
    @Column(nullable = false, length = 255)
    private String nome;
    @Column(nullable = false, length = 255)
    private String sobreNome;
    @Column(nullable = false, length = 255)
    private String nacionalidade;
    @Column(nullable = false, length = 255)
    private String dataNascimento;
    @Column(nullable = false, length = 255)
    private String estadoCivil;
    @Column(nullable = false, length = 255)
    private String genero;
    @Column(nullable = false, length = 255, unique = true)
    private int numeroRG;
    @Column(nullable = false, length = 255)
    private String orgaoExpedidor;
    @Column(nullable = false, length = 255, unique = true)
    private String numeroCpf;

    public UUID getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(UUID idPessoa) {
        this.idPessoa = idPessoa;
    }

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

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", sobreNome='" + sobreNome + '\'' +
                ", nacionalidade='" + nacionalidade + '\'' +
                ", dataNascimento='" + dataNascimento + '\'' +
                ", estadoCivil='" + estadoCivil + '\'' +
                ", genero=" + genero +
                ", numeroRG=" + numeroRG +
                ", orgaoExpedidor='" + orgaoExpedidor + '\'' +
                ", numeroCpf='" + numeroCpf + '\'' +
                '}';
    }


}
