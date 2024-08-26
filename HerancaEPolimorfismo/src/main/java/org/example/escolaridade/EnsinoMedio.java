package org.example.escolaridade;

public class EnsinoMedio extends Escolaridade {

    public EnsinoMedio(String escola) {
        super(escola);
    }

    @Override
    public String toString(){
        return "Ensino Médio";
    }
}
