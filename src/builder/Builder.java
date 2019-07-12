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
public class Builder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        AutoDirector director = new AutoDirector();
        director.setAutobuilder(new FordBuilder());
        director.constructAuto();
        Auto auto = director.getAuto();
        
        System.out.println(auto.getMarca());
        System.out.println(auto.getModelo());
    }
    
}
