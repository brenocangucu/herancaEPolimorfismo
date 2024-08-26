package org.example.funcionarios;

import org.example.comissoes.Cargo;
import org.example.escolaridade.EnsinoBasico;
import org.example.escolaridade.EnsinoMedio;
import org.example.escolaridade.Escolaridade;
import org.example.escolaridade.Graduacao;

import java.util.ArrayList;

public class RegistroDeFuncionarios {
    ArrayList<Funcionario> funcionarios;

    public RegistroDeFuncionarios(){
        funcionarios = new ArrayList<>();
    }

    public RegistroDeFuncionarios(int quantidadeDeFuncionarios){
        funcionarios = new ArrayList<>(quantidadeDeFuncionarios);
    }

    public void addFuncionario(Funcionario funcionario){
        funcionarios.add(funcionario);
    }

    public void addFuncionario(String nome){
        funcionarios.add(new Funcionario((nome)));
    }

    public void addFuncionario(String nome, Escolaridade escolaridade){
        funcionarios.add(new Funcionario(nome, escolaridade));
    }

    public void addFuncionario(String nome, Escolaridade escolaridade, Cargo cargo){
        funcionarios.add(new Funcionario(nome, escolaridade, cargo));
    }

    public ArrayList<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(ArrayList<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }

    public double salariosSemEscolaridade(){
        double salarioBasico = 0.0;

        for(Funcionario funcionario: funcionarios){
            if(funcionario.getEscolaridade() == null){
                salarioBasico += funcionario.renda;
            }
        }

        return salarioBasico;
    }

    public double salariosEnsinoBasico(){
        double salarioBasico = 0.0;

        for(Funcionario funcionario: funcionarios){
            if(funcionario.getEscolaridade() instanceof EnsinoBasico){
                salarioBasico += funcionario.renda;
            }
        }

        return salarioBasico;
    }

    public double salarioEnsinoMedio(){
        double salarioEnsinoMedio = 0.0;

        for(Funcionario funcionario: funcionarios){
            if(funcionario.getEscolaridade() instanceof EnsinoMedio){
                salarioEnsinoMedio += funcionario.renda;
            }
        }

        return salarioEnsinoMedio;
    }

    public double salarioGraduados(){
        double salarioGraduados = 0.0;

        for(Funcionario funcionario: funcionarios){
            if(funcionario.getEscolaridade() instanceof Graduacao){
                salarioGraduados += funcionario.renda;
            }
        }

        return salarioGraduados;
    }

    public double salariosTotal(){
        if(funcionarios.isEmpty()){
            return 0.0;
        }

        return funcionarios.stream().mapToDouble(salario -> salario.renda).sum();
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

}
