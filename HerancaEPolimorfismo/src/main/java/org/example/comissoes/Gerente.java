package org.example.comissoes;

public class Gerente extends Cargo {
    public Gerente(){
        this.comissao = 1500;
    }

    @Override
    public String toString(){
        return "Gerente";
    }
}
