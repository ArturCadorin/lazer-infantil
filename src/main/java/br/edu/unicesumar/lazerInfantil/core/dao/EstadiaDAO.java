
package br.edu.unicesumar.lazerInfantil.core.dao;

import br.edu.unicesumar.lazerInfantil.core.controllers.EstadiaController;
import br.edu.unicesumar.lazerInfantil.core.entity.Estadia;

/**
 * Método DAO para salvar o objeto estadia no banco de dados.
 * 
 * @author Artur Cadorin
 * @version 1.0
 */

public class EstadiaDAO {
    
    /**
     * Método para salvar o objeto estadia no banco de dados, nesse caso o método serve apenas de 
     * esboço e somente irá exibir no terminal os dados referentes ao objeto passado por argumento.
     * 
     * @param referenciaEstadia Faz referência ao objeto estadia que irá ser salvo no sistema.
     */
    
    public static void salvarEstadia(Estadia referenciaEstadia){
        System.out.println("Salvando estadia no Banco de Dados, Tempo Utilizado: " + referenciaEstadia.getTempoUtilizado() + 
                ", Crianca: " + referenciaEstadia.getReferenciaCrianca().getNome() + 
                ", Responsável: " + referenciaEstadia.getReferenciaResponsavel().getNome() +
                EstadiaController.valorEstadia(referenciaEstadia));
    }
}
