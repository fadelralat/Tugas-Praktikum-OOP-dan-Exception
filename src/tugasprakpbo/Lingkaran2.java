/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasprakpbo;

/**
 *
 * @author Acer Aspire
 */
public class Lingkaran2 extends Geometri {
    double r;

    public Lingkaran2(double r) {
        this.r = r;
    }

    
    @Override
    double luas(){
        return Math.PI * r * r;
    }
    
     @Override
    double keliling(){
        return Math.PI * r * 2;
    }
}