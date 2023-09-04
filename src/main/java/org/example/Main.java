package org.example;

import org.example.models.cadastro.funcionario.Funcionario;

public class Main {
    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Rafael Gomes de Oliveira");
        funcionario.setSobreNome("Gomes de Oliveira");
        funcionario.setDataNascimento("27.01.2000");
        funcionario.setGenero('M');
        funcionario.setNacionalidade("Brasileiro");
        funcionario.setNumeroCpf("071.888.851-09");
        funcionario.setEstadoCivil("Casado");
        funcionario.setNumeroRG(2311404);
        funcionario.setOrgaoExpedidor("ssp/ms");
        System.out.println(funcionario);

    }
}