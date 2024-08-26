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

import java.util.Arrays;

public class FuncionariosTeste {
    public static void main(String[] args) {
        RegistroDeFuncionarios registro = new RegistroDeFuncionarios();
        EnsinoBasico ensinoBasica = new EnsinoBasico("Ensino Básico");
        EnsinoMedio ensinoMedio = new EnsinoMedio("Ensino Médio");
        Graduacao graduacao = new Graduacao("Universidade");
        Cargo gerente = new Gerente();
        Cargo supervisor = new Supervisor();
        Cargo vendedor = new Vendedor();

        //4 funcionarios que possuem ensino básico (40%)
        Funcionario funcionario1 = new Funcionario("Joao1", ensinoBasica);
        Funcionario funcionario2 = new Funcionario("Joao2", ensinoBasica);
        Funcionario funcionario3 = new Funcionario("Joao3", ensinoBasica);
        Funcionario funcionario4 = new Funcionario("Joao4", ensinoBasica);

        //4 funcionarios que possuem ensino médio (40%
        Funcionario funcionario5 = new Funcionario("Joao5", ensinoMedio);
        Funcionario funcionario6 = new Funcionario("Joao6", ensinoMedio);
        Funcionario funcionario7 = new Funcionario("Joao7", ensinoMedio);
        Funcionario funcionario8 = new Funcionario("Joao8", ensinoMedio);

        //2 funcionarios que possuem graduação (20%)
        Funcionario funcionario9 = new Funcionario("Joao9", graduacao);
        Funcionario funcionario10 = new Funcionario("Joao10", graduacao);

        registro.addFuncionario(funcionario1);
        registro.addFuncionario(funcionario2);
        registro.addFuncionario(funcionario3);
        registro.addFuncionario(funcionario4);
        registro.addFuncionario(funcionario5);
        registro.addFuncionario(funcionario6);
        registro.addFuncionario(funcionario7);
        registro.addFuncionario(funcionario8);
        registro.addFuncionario(funcionario9);
        registro.addFuncionario(funcionario10);


        //Exercício 07 - Calcule os custos da empresa com salários totais e por nível de escolaridade,
        //utilize a classe funcionário desenvolvida no exercício anterior.
        System.out.println("Exercicio 07:\nCargos nao Comissionados\n--------------------\n");
        for (Funcionario funcionario : registro.getFuncionarios()) {
            System.out.println(funcionario);
            System.out.println();
        }

        System.out.println("Total Custo de Salarios (sem cargos comissionados): R$" + registro.salariosTotal() + "\n=============================================================");
        System.out.println();

        System.out.println(registro.salariosPorEscolaridade());
        System.out.println("==============================\n");

        //Exercício 10 - Refaça o exercício 7 considerando que 10% dos funcionários são
        //Gerentes, 20% são supervisores e 70% são vendedores.

        //1 funcionário gerente (10%)
        funcionario1.setCargo(gerente);

        //2 funcionários supervisores (20%)
        funcionario2.setCargo(supervisor);
        funcionario3.setCargo(supervisor);

        //7 funcionários vendedores (70%)
        funcionario4.setCargo(vendedor);
        funcionario5.setCargo(vendedor);
        funcionario6.setCargo(vendedor);
        funcionario7.setCargo(vendedor);
        funcionario8.setCargo(vendedor);
        funcionario9.setCargo(vendedor);
        funcionario10.setCargo(vendedor);

        //Calcule os custos da empresa com salários totais e por nível de escolaridade,
        //utilize a classe funcionário desenvolvida no exercício anterior

        //Exercício 11 Sobreescreva o método toString de forma que ele imprima o nome do
        //funcionário, a comissão e o salário total. Imprima todos os
        //funcionários da empresa criada no exercício 7

        System.out.println("Exercicios 10 e 11\nCargos Comissionados\n--------------------\n");
        for (Funcionario funcionario : registro.getFuncionarios()) {
            System.out.println(funcionario);
            System.out.println();
        }

        System.out.println("Total Custo de Salarios (com cargos comissionados): R$" + registro.salariosTotal() + "\n=============================================================");
        System.out.println();

        System.out.println(registro.salariosPorEscolaridade());
        System.out.println("==============================\n");
    }
}
