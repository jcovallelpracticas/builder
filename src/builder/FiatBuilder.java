/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;

/**
 *
 * @author jcovallel
 */
public class FiatBuilder extends Autobuilder{
    public void buildMarca(){
        auto.setMarca("Fiat");
    }
    
    public void buildModelo(){
        auto.setModelo("Palio");
    }
    
    public void buildMotor(){
        Motor motor = new Motor();
        motor.setNumero(323232);
        motor.setPotencia("23 hp");
        auto.setMotor(motor);
    }
    
    public void buildPuertas(){
        auto.setCantidadDePuertas(2);
    }
}
