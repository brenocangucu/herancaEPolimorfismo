package org.example.funcionarios;

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

    public ArrayList<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(ArrayList<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }

    public double custoDeSalarioSemEscolaridade(){
        double salarioBasico = 0.0;

        for(Funcionario funcionario: funcionarios){
            if(funcionario.getEscolaridade() == null){
                salarioBasico += funcionario.renda;
            }
        }

        return salarioBasico;
    }

    public double custoDeSalarioEnsinoBasico(){
        double salarioBasico = 0.0;

        for(Funcionario funcionario: funcionarios){
            if(funcionario.getEscolaridade() instanceof EnsinoBasico){
                salarioBasico += funcionario.renda;
            }
        }

        return salarioBasico;
    }

    public double custoDeSalarioEnsinoMedio(){
        double salarioEnsinoMedio = 0.0;

        for(Funcionario funcionario: funcionarios){
            if(funcionario.getEscolaridade() instanceof EnsinoMedio){
                salarioEnsinoMedio += funcionario.renda;
            }
        }

        return salarioEnsinoMedio;
    }

    public double custoDeSalarioGraduados(){
        double salarioGraduados = 0.0;

        for(Funcionario funcionario: funcionarios){
            if(funcionario.getEscolaridade() instanceof Graduacao){
                salarioGraduados += funcionario.renda;
            }
        }

        return salarioGraduados;
    }

    public double custosDeSalario(){
        if(funcionarios.isEmpty()){
            return 0.0;
        }

        return funcionarios.stream().mapToDouble(salario -> salario.renda).sum();
    }

    public String salariosPorEscolaridade(){
        StringBuilder str = new StringBuilder();

        str.append("Salários\nSem escolaridade: ").append(custoDeSalarioSemEscolaridade())
                .append("\nCom Ensino Básico: ").append(custoDeSalarioEnsinoBasico())
                .append("\nCom Ensino Médio: ").append(custoDeSalarioEnsinoMedio())
                .append("\nCom Graduação: ").append(custoDeSalarioGraduados())
                .append("\nTotal: ").append(custoDeSalarioSemEscolaridade() + custoDeSalarioEnsinoBasico() + custoDeSalarioEnsinoMedio() + custoDeSalarioGraduados());

        return str.toString();
    }

}
