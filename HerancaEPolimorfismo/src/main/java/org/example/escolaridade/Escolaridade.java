package org.example.escolaridade;

public abstract class Escolaridade {
    String instituicao;

    public Escolaridade(String escola){
        this.instituicao = escola;
    }

    public void setInstituicao(String instituicao) {
        this.instituicao = instituicao;
    }

    public String getInstituicao() {
        return instituicao;
    }
}
