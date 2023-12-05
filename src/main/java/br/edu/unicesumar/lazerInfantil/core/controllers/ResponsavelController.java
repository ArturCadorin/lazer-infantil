
package br.edu.unicesumar.lazerInfantil.core.controllers;

import br.edu.unicesumar.lazerInfantil.core.entity.Responsavel;
import br.edu.unicesumar.lazerInfantil.core.services.ResponsavelService;
import javax.swing.JOptionPane;

/**
 * Controller para a classe responsável, faz a chamada dos métodos services para validação da 
 * regra de negócio. 
 * 
 * @author Artur Cadorin
 * @version 1.0
 */

public class ResponsavelController {
    
    /**
     * Boolean para salvar o cadastro do responsável, é chamado o método service
     * através de um try catch, caso o service seja executado com sucesso, o método retorna true
     * e o controller é encerrado, caso o contrário é exibido uma mensagem de erro na tela.
     * 
     * @param referenciaResponsavel Faz referência ao objeto responsável para que seja validado pelo service.
     * 
     * @return boolean conforme a validação da regra de negócio.
     */
    
    public static boolean salvarResponsavel(Responsavel referenciaResponsavel){
        try{
            ResponsavelService.validarResponsavel(referenciaResponsavel);
        }catch(IllegalArgumentException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
            return false;
        }
        return true;
    }
}   
