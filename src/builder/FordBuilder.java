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
public class FordBuilder extends Autobuilder{
     public void buildMarca(){
        auto.setMarca("Ford");
    }
    
    public void buildModelo(){
        auto.setModelo("fiesta");
    }
    
    public void buildMotor(){
        Motor motor = new Motor();
        motor.setNumero(321232);
        motor.setPotencia("33 hp");
        auto.setMotor(motor);
    }
    
    public void buildPuertas(){
        auto.setCantidadDePuertas(4);
    }
}
