package org.example.models.cadastro.pessoa;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "emails")
public class Email {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID idEmail;

    @ManyToOne
    @JoinColumn(name = "idPessoa", referencedColumnName = "idPessoa")
    private ModelPessoa pessoa;

    @Column(nullable = false, length = 255)
    private String email;
    @Column(nullable = false, length = 255)
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
