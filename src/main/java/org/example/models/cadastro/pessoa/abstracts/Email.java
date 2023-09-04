package org.example.models.cadastro.pessoa.abstracts;

public abstract class Email {

    private String email;
    private String observacaoEmail;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getObservacaoEmail() {
        return observacaoEmail;
    }

    public void setObservacaoEmail(String observacaoEmail) {
        this.observacaoEmail = observacaoEmail;
    }
}
