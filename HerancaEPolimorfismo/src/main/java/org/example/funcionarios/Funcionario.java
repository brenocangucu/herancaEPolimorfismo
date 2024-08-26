package org.example.funcionarios;

import org.example.escolaridade.EnsinoBasico;
import org.example.escolaridade.EnsinoMedio;
import org.example.escolaridade.Escolaridade;
import org.example.escolaridade.Graduacao;
import org.example.comissoes.Cargo;

public class Funcionario {
    String nome;
    Escolaridade escolaridade;
    Cargo cargo;
    double renda;

    //caso não tenha escolaridade nem cargo comissionado
    public Funcionario(String nome) {
        this.nome = nome;
        this.escolaridade = new Escolaridade();
        this.cargo = null;
        calculoDaRenda();
    }

    //caso não tenha escolaridade mas tenha um dos cargos comissionados
    public Funcionario(String nome, Cargo cargo){
        this.nome = nome;
        this.escolaridade = new Escolaridade();
        this.cargo = cargo;
        calculoDaRenda();
    }

    //caso tenha escolaridade mas sem cargo comissionado
    public Funcionario(String nome, Escolaridade escolaridade){
        this.nome = nome;
        this.escolaridade = escolaridade;
        this.cargo = null;
        calculoDaRenda();
    }

    //caso tenha escolaridade e cargo comissionado
    public Funcionario(String nome, Escolaridade escolaridade, Cargo cargo){
        this.nome = nome;
        this.escolaridade = escolaridade;
        this.cargo = cargo;
        calculoDaRenda();
    }

    //Exercícios 06 e 09
    public double calculoDaRenda(){
        double RENDA_BASICA = 1000;
        double comissao = 0.0;

        if (cargo != null){
            comissao = cargo.getComissao();
        }

        if(escolaridade instanceof EnsinoBasico){
            return this.renda = (RENDA_BASICA * 1.1) + comissao;
        }

        if(escolaridade instanceof EnsinoMedio){
            return this.renda = (RENDA_BASICA * 1.1 * 1.5) + comissao;
        }

        if(escolaridade instanceof Graduacao){
            return this.renda = (RENDA_BASICA * 1.1 * 1.5 * 2) + comissao;
        }

        //caso o funcionário não tenha escolaridade
        return this.renda = RENDA_BASICA + comissao;
    }

    //métodos get
    public String getNome() {
        return nome;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public Escolaridade getEscolaridade() {
        return escolaridade;
    }

    public double getRenda() {
        return renda;
    }

    //métodos set
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEscolaridade(Escolaridade escolaridade) {
        this.escolaridade = escolaridade;
        calculoDaRenda();
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
        calculoDaRenda();
    }

    /*
    Exercício 11
    Sobreescreva o método toString de forma que ele imprima o nome do
    funcionário, a comissão e o salário total. Imprima todos os
    funcionários da empresa criada no exercício 7.
     */

    @Override
    public String toString(){
        StringBuilder str = new StringBuilder();

        if(cargo == null){
            str.append("Funcionario\nNome: ").append(nome)
                    .append("\nEscolaridade: ").append(getEscolaridade())
                    .append("\nSalario Total: R$").append(renda);

            return str.toString();
        }

        str.append("Funcionario\nNome: ").append(nome)
                .append("\nEscolaridade: ").append(getEscolaridade())
                .append("\nSalario por Escolaridade: R$").append(getRenda() - cargo.getComissao())
                .append("\nCargo: ").append(getCargo())
                .append("\nComissao: R$").append(cargo.getComissao())
                .append("\nSalario Total: R$").append(renda);

        return str.toString();
    }
}
