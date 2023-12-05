
package br.edu.unicesumar.lazerInfantil.core.dao;

import br.edu.unicesumar.lazerInfantil.core.entity.Crianca;

/**
 * Método DAO para salvar o objeto criança no banco de dados.
 * 
 * @author Artur Cadorin
 * @version 1.0
 */

public class CriancaDAO {
    
    /**
     * Método para salvar o objeto crianca no banco de dados, nesse caso o método serve apenas de 
     * esboço e somente irá exibir no terminal os dados referentes ao objeto passado por argumento.
     * 
     * @param referenciaCrianca Faz referência ao objeto criança que irá ser salvo nos sistema.
     */
    
    public static void salvarCrianca(Crianca referenciaCrianca){
        System.out.println("Salvando Criança no Banco de Dados, Nome do Responsável: " + 
                referenciaCrianca.getResponsavel().getNome() + ", Nome Criança: " + referenciaCrianca.getNome() +
                ", Idade: " + referenciaCrianca.getIdade() + ", Sexo: " + referenciaCrianca.getSexo());
    }
}
