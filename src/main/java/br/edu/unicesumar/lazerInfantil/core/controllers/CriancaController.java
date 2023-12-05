
package br.edu.unicesumar.lazerInfantil.core.controllers;

import br.edu.unicesumar.lazerInfantil.core.entity.Crianca;
import br.edu.unicesumar.lazerInfantil.core.services.CriancaService;
import javax.swing.JOptionPane;

/**
 * Controller para a classe criança, faz a chamada dos métodos services para validação da 
 * regra de negócio. 
 * 
 * @author Artur Cadorin
 * @version 1.0
 */

public class CriancaController {
    
    /**
     * Boolean para salvar o cadastro da criança, é chamado o método service
     * através de um try catch, caso o service seja executado com sucesso, o método retorna true
     * e o controller é encerrado, caso o contrário é exibido uma mensagem de erro na tela.
     * 
     * @param referenciaCrianca Faz referência ao objeto criança para que seja validado pelo service.
     * 
     * @return boolean conforme a validação da regra de negócio.
     */
    
    public static boolean salvarCrianca(Crianca referenciaCrianca){
        try{
            CriancaService.validarCrianca(referenciaCrianca);
        }catch(IllegalArgumentException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
            return false;
        }
        return true;
    }
}