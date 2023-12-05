
package br.edu.unicesumar.lazerInfantil.core.entity;

/**
 * Classe Estadia para fazer referência como model da aplicação.
 * 
 * @author Artur Cadorin
 * @version 1.0
 */

public class Estadia {
    
    private Responsavel referenciaResponsavel;
    private Crianca referenciaCrianca;
    private int tempoUtilizado;
    
    public Estadia(Responsavel referenciaResponsavel, Crianca referenciaCrianca){
        this.referenciaResponsavel = referenciaResponsavel;
        this.referenciaCrianca = referenciaCrianca;
    }

    public Responsavel getReferenciaResponsavel() {
        return referenciaResponsavel;
    }

    public void setReferenciaResponsavel(Responsavel referenciaResponsavel) {
        this.referenciaResponsavel = referenciaResponsavel;
    }

    public Crianca getReferenciaCrianca() {
        return referenciaCrianca;
    }

    public void setReferenciaCrianca(Crianca referenciaCrianca) {
        this.referenciaCrianca = referenciaCrianca;
    }

    public int getTempoUtilizado() {
        return tempoUtilizado;
    }

    public void setTempoUtilizado(int tempoUtilizado) {
        this.tempoUtilizado = tempoUtilizado;
    }
    
}
