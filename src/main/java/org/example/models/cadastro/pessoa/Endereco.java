package org.example.models.cadastro.pessoa;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "Enderecos")
public class Endereco {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID idEndereco;

    @ManyToOne
    @JoinColumn(name = "idPessoa", referencedColumnName = "idPessoa")
    private ModelPessoa pessoa;
    @Column(nullable = false, length = 255)
    private String cidade;
    @Column(nullable = false, length = 255)
    private String estado;
    @Column(nullable = false, length = 255)
    private String bairro;
    @Column(nullable = false, length = 255)
    private String rua;
    @Column(nullable = false, length = 255)
    private String numero;
    @Column(nullable = false, length = 255)
    private String complemento;
    @Column(nullable = false, length = 255)
    private String observacaoEndereco;

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getObservacaoEndereco() {
        return observacaoEndereco;
    }

    public void setObservacaoEndereco(String observacaoEndereco) {
        this.observacaoEndereco = observacaoEndereco;
    }
}
