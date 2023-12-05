
package br.edu.unicesumar.lazerInfantil.core.controllers;

import br.edu.unicesumar.lazerInfantil.core.entity.Estadia;
import br.edu.unicesumar.lazerInfantil.core.services.EstadiaService;
import java.text.NumberFormat;
import javax.swing.JOptionPane;

/**
 * Controller para a classe estadia, faz a chamada dos métodos services para validação da 
 * regra de negócio. 
 * 
 * @author Artur Cadorin
 * @version 1.0
 */

public class EstadiaController {
    
    /**
     * Boolean para salvar o cadastro da estadia, é chamado o método service
     * através de um try catch, caso o service seja executado com sucesso, o método retorna true
     * e o controller é encerrado, caso o contrário é exibido uma mensagem de erro na tela.
     * 
     * @param referenciaEstadia Faz referência ao objeto estadia para que seja validado pelo service.
     * 
     * @return boolean conforme a validação da regra de negócio.
     */
    
    public static boolean salvarEstadia(Estadia referenciaEstadia){
        try{
            EstadiaService.validarEstadia(referenciaEstadia);
        }catch(IllegalArgumentException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
            return false;
        }
        return true;
    }
    
    /**
     * Retornar o valor a ser pago pela estadia, esse método faz a referencia 
     * ao método implementado pelo seu respectivo service, pegando apenas o valor a ser pago.
     * 
     * @param referenciaEstadia Faz referência ao objeto estadia para obter o valor a ser pago
     * @return String com o valor a ser pago.
     */
    
    public static String valorEstadia(Estadia referenciaEstadia){
        double valor = EstadiaService.valorEstadia(referenciaEstadia);
        String valorFinal = NumberFormat.getCurrencyInstance().format(valor);
        
        return "\nValor a Pagar: " + valorFinal;
    }
}
