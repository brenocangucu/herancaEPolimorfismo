package org.example.animais;

public class Veterinario {

    public void Examinar(Animal animal){
        animal.emitirSom();
    }

    public void Examinar(Animal animal1, Animal animal2){
        animal1.emitirSom();
        animal2.emitirSom();
    }

    public void Examinar(Animal animal1, Animal animal2, Animal animal3){
        animal1.emitirSom();
        animal2.emitirSom();
        animal3.emitirSom();
    }
}
