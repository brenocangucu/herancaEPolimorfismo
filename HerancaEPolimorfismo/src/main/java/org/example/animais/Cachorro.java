package org.example.animais;

public class Cachorro extends Animal implements AnimalCorredor{

    public Cachorro(String name, int idade) {
        super(name, idade);
    }

    @Override
    public void corre() {
        System.out.println(nome + " correu.");
    }
}
