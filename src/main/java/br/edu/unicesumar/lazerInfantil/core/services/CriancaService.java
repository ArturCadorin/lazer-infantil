
package br.edu.unicesumar.lazerInfantil.core.services;

import br.edu.unicesumar.lazerInfantil.core.dao.CriancaDAO;
import br.edu.unicesumar.lazerInfantil.core.entity.Crianca;

/**
 * Service para validação da regra de negócio referente a classe Crianca, além da chamada do DAO.
 * 
 * @author Artur Cadorin
 * @version 1.0
 */

public class CriancaService {
    
    /**
     * Chamar a validação da regra de negócio, primeiramente ocorre a chamada
     * do método para validar a idade da criança, se o requisito for atendido o método da sequência ao DAO.
     * 
     * @param referenciaCrianca Faz referência ao objeto criança que irá ser salvo nos sistema.
     * @throws IllegalArgumentException se o campo idade não for validado.
     */
    
    public static void validarCrianca(Crianca referenciaCrianca) throws IllegalArgumentException{
        if(checarIdade(referenciaCrianca)){
            CriancaDAO.salvarCrianca(referenciaCrianca);
        }
    }
    
    /**
     * Checar a idade da crianca atráves do objeto passado como parâmetro, nesse caso temos como
     * regra de negócio que a idade permitida para a criança seja maior de 5 anos.
     * 
     * @param referenciaCrianca Faz referência ao objeto criança para efetuar a validação do campo Idade.
     * @return boolean de acordo com a validação da regra de negócio.
     * @throws IllegalArgumentException se a idade for menor que 5.
     */
    
    private static boolean checarIdade(Crianca referenciaCrianca){
        if(referenciaCrianca.getIdade() < 5){
            throw new IllegalArgumentException("Não foi possível continuar o cadastro. Criança menor de 5 anos");
        }
        return true;
    }
}
