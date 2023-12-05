
package br.edu.unicesumar.lazerInfantil.core.dao;

import br.edu.unicesumar.lazerInfantil.core.entity.Responsavel;

/**
 * Método DAO para salvar o objeto responsável no banco de dados.
 * 
 * @author Artur Cadorin
 * @version 1.0
 */

public class ResponsavelDAO {
    
    /**
     * Método para salvar o objeto responsável no banco de dados, nesse caso o método serve apenas de 
     * esboço e somente irá exibir os dados referentes ao objeto passado por argumento.
     * 
     * @param referenciaResponsavel Faz referência ao objeto responsável que irá ser salvo no sistema.
     */
    
    public static void salvarResponsavel(Responsavel referenciaResponsavel){
        System.out.println("Salvando responsável no Banco de Dados, Nome: " + referenciaResponsavel.getNome());
    }
}