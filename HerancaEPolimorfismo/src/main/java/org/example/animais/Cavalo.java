package org.example.animais;

public class Cavalo extends Animal implements AnimalCorredor{

    public Cavalo(String name, int idade) {
        super(name, idade);
    }

    @Override
    public void corre() {
        System.out.println(nome + " correu.");
    }
}
