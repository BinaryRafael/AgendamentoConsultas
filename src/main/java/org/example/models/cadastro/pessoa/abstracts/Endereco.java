package org.example.models.cadastro.pessoa.abstracts;

public class Endereco {

    private String cidade;
    private String estado;
    private String bairro;
    private String rua;
    private String numero;
    private String complemento;
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
