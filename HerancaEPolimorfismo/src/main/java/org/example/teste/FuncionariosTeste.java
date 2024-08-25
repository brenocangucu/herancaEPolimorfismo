package org.example.teste;

import org.example.escolaridade.EnsinoBasico;
import org.example.escolaridade.EnsinoMedio;
import org.example.escolaridade.Graduacao;
import org.example.funcionarios.Funcionario;
import org.example.funcionarios.RegistroDeFuncionarios;

import java.util.Arrays;

public class FuncionariosTeste {
    public static void main(String[] args){
        RegistroDeFuncionarios registro = new RegistroDeFuncionarios();
        EnsinoBasico ensinoBasica = new EnsinoBasico("Ensino Básico");
        EnsinoMedio ensinoMedio = new EnsinoMedio("Ensino Médio");
        Graduacao graduacao = new Graduacao("Universidade");

        //4 funcionarios que possuem ensino básico
        Funcionario funcionario1 = new Funcionario("João1", ensinoBasica);
        Funcionario funcionario2 = new Funcionario("João2", ensinoBasica);
        Funcionario funcionario3 = new Funcionario("João3", ensinoBasica);
        Funcionario funcionario4 = new Funcionario("João4", ensinoBasica);

        //4 funcionarios que possuem ensino médio
        Funcionario funcionario5 = new Funcionario("João5", ensinoMedio);
        Funcionario funcionario6 = new Funcionario("João6", ensinoMedio);
        Funcionario funcionario7 = new Funcionario("João7", ensinoMedio);
        Funcionario funcionario8 = new Funcionario("João8", ensinoMedio);

        //2 funcionarios que possuem graduação
        Funcionario funcionario9 = new Funcionario("João9", graduacao);
        Funcionario funcionario10 = new Funcionario("João10", graduacao);

        for (Funcionario funcionario : Arrays.asList(funcionario1, funcionario2, funcionario3, funcionario4, funcionario5, funcionario6, funcionario7, funcionario8, funcionario9, funcionario10)) {
            registro.addFuncionario(funcionario);
        }

        System.out.println("Custo total: " + registro.custosDeSalario());
        System.out.println();

        System.out.println("Custo por Escolaridade: " + registro.salariosPorEscolaridade());
    }
}
