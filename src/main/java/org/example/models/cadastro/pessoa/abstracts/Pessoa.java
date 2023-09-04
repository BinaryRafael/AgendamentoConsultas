package org.example.models.cadastro.pessoa.abstracts;

public abstract class Pessoa {

    private String nome;
    private String sobreNome;

    private String nacionalidade;
    private String dataNascimento;
    private String estadoCivil;
    private char genero;
    private int numeroRG;
    private String orgaoExpedidor;
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

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
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
