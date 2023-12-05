
package br.edu.unicesumar.lazerInfantil.core.services;

import br.edu.unicesumar.lazerInfantil.core.dao.ResponsavelDAO;
import br.edu.unicesumar.lazerInfantil.core.entity.Responsavel;

/**
 * Service para validação da regra de negócio referente a classe Responsavel, além da chamada do DAO. 
 * 
 * @author Artur Cadorin
 * @version 1.0
 */

public class ResponsavelService {
    
    /**
     * Método para chamar a validação da regra de negócio, primeiramente faz a chamada
     * do método para validar a idade do responsável, se o requisito for atendido o método da sequência ao DAO, 
     * caso o contrario ele lançara uma exceção exibindo a mensagem na tela.
     * 
     * @param referenciaResponsavel Faz referência ao objeto responsável que irá ser salvo nos sistema.
     */
    
    public static void validarResponsavel(Responsavel referenciaResponsavel) throws IllegalArgumentException{
        if(checarIdade(referenciaResponsavel)){
            ResponsavelDAO.salvarResponsavel(referenciaResponsavel);
        }
    }
    
    /**
     * Método para checar a idade do responsável atráves do objeto passado como parâmetro, nesse caso temos como
     * regra de negócio que o responsável seja maior de 18 anos, o método pode lançar uma exceção caso a idade 
     * seja inferior a permitida no cadastro.
     * 
     * @param referenciaResponsavel Faz referência ao objeto responsável para efetuar a validação do campo Idade.
     * @return boolean de acordo com a validação da regra de negócio.
     * @throws IllegalArgumentException se a idade for menor que 18.
     */
    
    private static boolean checarIdade(Responsavel referenciaResponsavel){
        if(referenciaResponsavel.getIdade() < 18){
            throw new IllegalArgumentException("Não foi possível continuar o cadastro. Responsável menor de 18 anos");
        }
        return true;
    }
}
