package org.example.comissoes;

public class Supervisor extends Cargo {
    public Supervisor(){
        this.comissao = 600.0;
    }

    @Override
    public String toString(){
        return "Supervisor";
    }
}
