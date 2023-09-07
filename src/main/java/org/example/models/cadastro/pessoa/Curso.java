package org.example.models.cadastro.pessoa;

import javax.persistence.*;
import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "Cursos")
public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID idCurso;

    @ManyToOne
    @JoinColumn(name = "idPessoa", referencedColumnName = "idPessoa")
    private ModelPessoa pessoa;
    @Column(nullable = false, length = 255)
    private String instituicao;
    @Column(nullable = false, length = 255)
    private String nome;
    @Column(nullable = false, length = 255)
    private Date dataInicio;
    @Column(nullable = false, length = 255)
    private Date dataFim;

    public String getInstituicao() {
        return instituicao;
    }

    public void setInstituicao(String instituicao) {
        this.instituicao = instituicao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Date getDataFim() {
        return dataFim;
    }

    public void setDataFim(Date dataFim) {
        this.dataFim = dataFim;
    }
}
