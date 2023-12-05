
package br.edu.unicesumar.lazerInfantil.core.services;

import br.edu.unicesumar.lazerInfantil.core.dao.EstadiaDAO;
import br.edu.unicesumar.lazerInfantil.core.entity.Estadia;

/**
 * Service para validação da regra de negócio referente ao objeto estadia, aonde é feito o calculo 
 * do valor a pagar conforme a regra de negócio pré-estabelecida, além disso é feita a chamada
 * do DAO referente a estadia.
 * 
 * @author Artur Cadorin
 * @version 1.0
 */

public class EstadiaService {
    
    /*
        VALOR_MINUTO = Valor do minuto.
        PORCENTAGEM_DESCONTO_20MINUTOS = Porcentagem do desconto para estadias de até 20 minutos.
        PORCENTAGEM_DESCONTO_40MINUTOS = Porcentagem do desconto para estadias de até 40 minutos.
        PORCENTAGEM_DESCONTO_60MINUTOS = Porcentagem do desconto para estadias de até 60 minutos.
    */
    
    private final static double VALOR_MINUTO = 1.50;
    private final static double PORCENTAGEM_DESCONTO_20MINUTOS = 5;
    private final static double PORCENTAGEM_DESCONTO_40MINUTOS = 10;
    private final static double PORCENTAGEM_DESCONTO_60MINUTOS = 15;
    
    /**
     * Chamar a validação da regra de negócio, primeiramente ocorre a chamada
     * do método para validar o campo TempoUtilizado, se o requisito for atendido o método da sequência ao DAO
     * 
     * @param referenciaEstadia Faz referência ao objeto estadia que irá ser salvo nos sistema.
     * @throws IllegalArgumentException se o campo tempo não for validado.
     */
    
    public static void validarEstadia(Estadia referenciaEstadia) throws IllegalArgumentException{
        if(validarTempo(referenciaEstadia)){
            EstadiaDAO.salvarEstadia(referenciaEstadia);
        }
    }
    
    /**
     * Validar o campo TempoUtilizado, não permitindo inserção menor que zero.
     * 
     * @param referenciaEstadia Faz referência ao objeto estadia, para efetuar a validação do campo TempoUtilizado.
     * @return boolean de acordo com a validação da regra de negócio.
     * @throws IllegalArgumentException se o tempo da estadia for menor ou igual a 0.
     */
    
    private static boolean validarTempo(Estadia referenciaEstadia){
        if(referenciaEstadia.getTempoUtilizado() <= 0){
            throw new IllegalArgumentException("Tempo de estádia menor que 0.");
        }
        return true;
    } 
    
    /**
     * Realização da regra de negócio e calculo do valor a ser pago pela estadia,
     * atribuindo seu respectivo desconto conforme a regra pré-estabelecida.
     * 
     * @param referenciaEstadia Faz referência ao objeto estadia, para efetuar o calculo do valor a ser pago.
     * @return Double com o valor a ser pago pela estadia.
     * @throws IllegalArgumentException se a estadia não for validada.
     */
    
    public static double valorEstadia(Estadia referenciaEstadia) throws IllegalArgumentException{
        
        /*
            tempoUtilizado = Tempo de estadia, do objeto passado por parâmetro.
        */
        
        double tempoUtilizado = referenciaEstadia.getTempoUtilizado();
        double valorSemDesconto = tempoUtilizado * VALOR_MINUTO;
        /*
            Atribuindo o respectivo desconto e retornando o valor final da estadia.
        */
        if(validarTempo(referenciaEstadia)){
            double desconto;
            if(tempoUtilizado >= 60){
                desconto = valorSemDesconto * PORCENTAGEM_DESCONTO_60MINUTOS / 100;
                return valorSemDesconto - desconto;
            }else if(tempoUtilizado >= 40){
                desconto = valorSemDesconto * PORCENTAGEM_DESCONTO_40MINUTOS / 100;
                return valorSemDesconto - desconto;
            }else if(tempoUtilizado >= 20){
                desconto = valorSemDesconto * PORCENTAGEM_DESCONTO_20MINUTOS / 100;
                return valorSemDesconto - desconto;
            }
        }
        return valorSemDesconto;
    }          
}
