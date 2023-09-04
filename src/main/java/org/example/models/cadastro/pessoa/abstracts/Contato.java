package org.example.models.cadastro.pessoa.abstracts;

public abstract class Contato {

    private String numeroTelefone;
    private String observacaoTelefone;

    public String getNumeroTelefone() {
        return numeroTelefone;
    }

    public void setNumeroTelefone(String numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }

    public String getObservacaoTelefone() {
        return observacaoTelefone;
    }

    public void setObservacaoTelefone(String observacaoTelefone) {
        this.observacaoTelefone = observacaoTelefone;
    }
}
