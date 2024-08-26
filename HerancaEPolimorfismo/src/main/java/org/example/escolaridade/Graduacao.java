package org.example.escolaridade;

public class Graduacao extends Escolaridade {
    public Graduacao(String universidade) {
        super(universidade);
    }

    @Override
    public String toString(){
        return "Ensino Superior";
    }
}
