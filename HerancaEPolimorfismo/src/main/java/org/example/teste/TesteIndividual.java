package org.example.teste;

import org.example.comissoes.Cargo;
import org.example.comissoes.Gerente;
import org.example.comissoes.Supervisor;
import org.example.comissoes.Vendedor;
import org.example.escolaridade.EnsinoBasico;
import org.example.escolaridade.EnsinoMedio;
import org.example.escolaridade.Graduacao;
import org.example.funcionarios.Funcionario;
import org.example.funcionarios.RegistroDeFuncionarios;

public class TesteIndividual {
    public static void main(String[] args){
        RegistroDeFuncionarios registro = new RegistroDeFuncionarios();
        EnsinoBasico ensinoBasica = new EnsinoBasico("Ensino Básico");
        EnsinoMedio ensinoMedio = new EnsinoMedio("Ensino Médio");
        Graduacao graduacao = new Graduacao("Universidade");
        Cargo gerente = new Gerente();
        Cargo supervisor = new Supervisor();
        Cargo vendedor = new Vendedor();

        Funcionario funcionario1 = new Funcionario("João1");
        funcionario1.setEscolaridade(graduacao);
        funcionario1.setCargo(vendedor);

        System.out.println(funcionario1);

    }
}
