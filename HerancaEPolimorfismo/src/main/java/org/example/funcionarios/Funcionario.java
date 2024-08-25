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

    public Funcionario(String nome) {
        this.nome = nome;
        this.renda = calculoDaRenda();
    }

    public Funcionario(String nome, Escolaridade escolaridade){
        this.nome = nome;
        this.escolaridade = escolaridade;
        this.renda = calculoDaRenda();
    }

    public Funcionario(String nome, Escolaridade escolaridade, Cargo cargo){
        this.nome = nome;
        this.escolaridade = escolaridade;
        this.cargo = cargo;
        this.renda = calculoDaRenda();
    }

    public double calculoDaRenda(){
        double RENDA_BASICA = 1000;
        double comissao = cargo.getComissao();

        if(escolaridade instanceof EnsinoBasico){
            return (RENDA_BASICA * 1.1) + comissao;
        }

        if(escolaridade instanceof EnsinoMedio){
            return (RENDA_BASICA * 1.1 * 1.5) + comissao;
        }

        if(escolaridade instanceof Graduacao){
            return (RENDA_BASICA * 1.1 * 1.5 * 2) + comissao;
        }

        return RENDA_BASICA + comissao;
    }

    public String getNome() {
        return nome;
    }

    public Escolaridade getEscolaridade() {
        return escolaridade;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEscolaridade(Escolaridade escolaridade) {
        this.escolaridade = escolaridade;
    }

    @Override
    public String toString(){
        StringBuilder str = new StringBuilder();

        str.append("Funcionário\nNome: ").append(nome)
                .append("\nComissão: R$").append(cargo.getComissao())
                .append("\nSalário Total: ").append(renda);

        return str.toString();
    }
}
