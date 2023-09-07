package org.example.models.cadastro.pessoa;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "Contatos")
public class Contato {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID idContato;

    @ManyToOne
    @JoinColumn(name = "idPessoa", referencedColumnName = "idPessoa")
    private ModelPessoa pessoa;

    @Column(nullable = false, length = 255)
    private String numeroTelefone;

    @Column(nullable = false, length = 255)
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
