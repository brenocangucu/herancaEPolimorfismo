package org.example.comissoes;

public class Vendedor extends Cargo {
    public Vendedor(){
        this.comissao = 250.0;
    }

    @Override
    public String toString(){
        return "Vendedor";
    }
}
