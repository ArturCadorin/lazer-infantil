
package br.edu.unicesumar.lazerInfantil.core.entity;

/**
 * Classe Crianca para fazer referência como model da aplicação.
 * 
 * @author Artur Cadorin
 * @version 1.0
 */

public class Crianca {
    
    Responsavel responsavel;
    private String nome;
    private int idade;
    private String sexo;
    
    public Responsavel getResponsavel() {
        return responsavel;
    }
    public void setResponsavel(Responsavel responsavel){
        this.responsavel = responsavel;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
}
