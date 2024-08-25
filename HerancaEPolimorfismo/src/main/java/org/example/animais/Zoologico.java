package org.example.animais;


public class Zoologico {
    Animal[] animais;

    public Zoologico(){
        this.animais = new Animal[10];
    }

    public Zoologico(Animal[] animais){
        this.animais = animais;
    }

    public void adicionarAnimal(Animal animal){
        for(int i = 0; i < 10; i++){
            if(animais[i] == null){
                animais[i] = animal;
                return;
            }
        }
    }

    public void adicionarAnimal(Animal animal, int index){
        animais[index] = animal;
    }

    public void adicionarTodosAnimais(Animal[] animais){
        this.animais = animais;
    }

    public void emitirSoms(){
        for(int i = 0; i < 10 ; i++){
            Animal animal = animais[i];
            if(animal instanceof AnimalCorredor){
                ((AnimalCorredor) animal).corre();
            }
        }
    }

    //método get
    public Animal[] getAnimais() {
        return animais;
    }

    //método set
    public void setAnimais(Animal[] animais) {
        this.animais = animais;
    }
}
