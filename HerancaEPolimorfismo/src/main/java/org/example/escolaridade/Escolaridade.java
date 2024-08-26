package org.example.escolaridade;

public class Escolaridade {
    String instituicao;

    public Escolaridade(){

    }

    public Escolaridade(String instituicao){
        this.instituicao = instituicao;
    }

    public void setInstituicao(String instituicao) {
        this.instituicao = instituicao;
    }

    public String getInstituicao() {
        return instituicao;
    }

    @Override
    public String toString(){
        return "Sem ensino";
    }
}
