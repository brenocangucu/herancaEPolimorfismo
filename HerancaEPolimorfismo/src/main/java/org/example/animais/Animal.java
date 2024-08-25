package org.example.animais;

public abstract class Animal {
    String nome;
    int idade;

    public Animal(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public void emitirSom(){
        System.out.println(nome + ": emitiu um som");
    }


    //Métodos get
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }


    //Métodos Set
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
