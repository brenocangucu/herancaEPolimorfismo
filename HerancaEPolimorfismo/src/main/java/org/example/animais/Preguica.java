package org.example.animais;

public class Preguica extends Animal implements AnimalSobeEmArvore{

    public Preguica(String name, int idade) {
        super(name, idade);
    }

    @Override
    public void sobeEmArvore() {
        System.out.println(nome + ": subiu na árvore.");
    }
}
