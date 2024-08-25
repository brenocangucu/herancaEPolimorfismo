package org.example.teste;

import org.example.animais.*;

public class AnimaisTeste {
    public static void main(String[] args){
        System.out.println("Questao 2");
        Animal animal1 = new Cachorro("Cachorro1", 10);
        Animal animal2 = new Cavalo("Cavalo1", 5);
        Animal animal3 = new Preguica("Preguiça1", 2);

        emitirSom(animal1);
        emitirSom(animal2);
        emitirSom(animal3);

        System.out.println();

        System.out.println("Questao 3");
        Veterinario veterinario = new Veterinario();
        veterinario.Examinar(animal1, animal2, animal3);

        System.out.println();

        System.out.println("Questao 4");
        Animal animal4 = new Preguica("Preguiça2", 1);
        Animal animal5 = new Cachorro("Cachorro2", 5);
        Animal animal6 = new Cavalo("Cavalo2" , 4);
        Animal animal7 = new Cachorro("Cachorro3", 4);
        Animal animal8 = new Preguica("Preguiça3", 3);
        Animal animal9 = new Cavalo("Cavalo3", 3);
        Animal animal10 = new Cachorro("Cachorro4", 2);

        //7 animais correm e 3 sobem em árvore;
        Animal[] animais = {animal1, animal2, animal3, animal4, animal5, animal6, animal7, animal8, animal9, animal10};
        Zoologico zoo = new Zoologico(animais);
        zoo.emitirSoms();
    }

    public static void emitirSom(Animal animal){
        animal.emitirSom();
    }
}
