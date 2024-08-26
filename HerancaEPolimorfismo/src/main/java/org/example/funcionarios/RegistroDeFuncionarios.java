package org.example.funcionarios;

import org.example.comissoes.Cargo;
import org.example.escolaridade.EnsinoBasico;
import org.example.escolaridade.EnsinoMedio;
import org.example.escolaridade.Escolaridade;
import org.example.escolaridade.Graduacao;

public class RegistroDeFuncionarios {
    Funcionario[] funcionarios;

    public RegistroDeFuncionarios(){
        funcionarios = new Funcionario[10];
    }

    public RegistroDeFuncionarios(int quantidadeDeFuncionarios){
        this.funcionarios = new Funcionario[quantidadeDeFuncionarios];
    }

    public void addFuncionario(Funcionario funcionario){
            int index = indexaDorVazio();

            if(index < 0){
                resize();
                index = indexaDorVazio();
            }

            funcionarios[index] = funcionario;
        }

    public void addFuncionario(String nome) {
        int index = indexaDorVazio();

        if(index < 0){
            resize();
            index = indexaDorVazio();
        }

        funcionarios[index] = new Funcionario(nome);
    }

    public void addFuncionario(String nome, Escolaridade escolaridade){
        int index = indexaDorVazio();

        if(index < 0){
            resize();
            index = indexaDorVazio();
        }

        funcionarios[index] = new Funcionario(nome, escolaridade);
    }

    public void addFuncionario(String nome, Escolaridade escolaridade, Cargo cargo){
        int index = indexaDorVazio();

        if(index < 0){
            resize();
            index = indexaDorVazio();
        }

        funcionarios[index] = new Funcionario(nome, escolaridade, cargo);
    }

    public Funcionario[] getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(Funcionario[] funcionarios) {
        this.funcionarios = funcionarios;
    }

    public double salariosSemEscolaridade(){
        double salarioBasico = 0.0;

        for(Funcionario funcionario: funcionarios){
            if(funcionario == null){
                continue;
            }

            if(funcionario.getEscolaridade() == null){
                salarioBasico += funcionario.renda;
            }
        }

        return salarioBasico;
    }

    public double salariosEnsinoBasico(){
        double salarioBasico = 0.0;

        for(Funcionario funcionario: funcionarios){
            if(funcionario == null){
                continue;
            }

            if(funcionario.getEscolaridade() instanceof EnsinoBasico){
                salarioBasico += funcionario.renda;
            }
        }

        return salarioBasico;
    }

    public double salarioEnsinoMedio(){
        double salarioEnsinoMedio = 0.0;

        for(Funcionario funcionario: funcionarios){
            if(funcionario == null){
                continue;
            }

            if(funcionario.getEscolaridade() instanceof EnsinoMedio){
                salarioEnsinoMedio += funcionario.renda;
            }
        }

        return salarioEnsinoMedio;
    }

    public double salarioGraduados(){
        double salarioGraduados = 0.0;

        for(Funcionario funcionario: funcionarios){
            if(funcionario == null){
                continue;
            }

            if(funcionario.getEscolaridade() instanceof Graduacao){
                salarioGraduados += funcionario.renda;
            }
        }

        return salarioGraduados;
    }

    public double salariosTotal(){
        if(registroIsEmpty()){
            return 0.0;
        }

        return salariosSemEscolaridade() + salariosEnsinoBasico() + salarioEnsinoMedio() + salarioGraduados();
    }

    public String salariosPorEscolaridade(){
        StringBuilder str = new StringBuilder();

        str.append("Salarios Por Escolaridade\nSem escolaridade: R$").append(salariosSemEscolaridade())
                .append("\nCom Ensino Basico: R$").append(salariosEnsinoBasico())
                .append("\nCom Ensino Medio: R$").append(salarioEnsinoMedio())
                .append("\nCom Graduacao: R$").append(salarioGraduados())
                .append("\nTotal: R$").append(salariosSemEscolaridade() + salariosEnsinoBasico() + salarioEnsinoMedio() + salarioGraduados());

        return str.toString();
    }

    public boolean registroIsEmpty(){
        for(int i = 0 ; i < funcionarios.length ; i++){
            if(funcionarios[i] != null){
                return false;
            }
        }
        return true;
    }

    public int indexaDorVazio() {
        for (int i = 0; i < funcionarios.length; i++) {
            if (funcionarios[i] == null) {
                return i;
            }
        }

        return -1;
    }

    public void resize(){
        this.funcionarios = new Funcionario[funcionarios.length + (funcionarios.length /2)];
    }

}
