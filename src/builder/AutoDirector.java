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
public class AutoDirector {
    private Autobuilder autobuilder;
    public void constructAuto () {
        autobuilder.crearAuto();
        autobuilder.buildMarca();
        autobuilder.buildModelo();
        autobuilder.buildMotor();
        autobuilder.buildPuertas();
    }

    public Auto getAuto() {
        return autobuilder.getAuto();
    }

    public void setAutobuilder(Autobuilder ab) {
        autobuilder = ab;
    }
    
}
