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
public class Persegi extends Geometri {
    int sisi;

    Persegi(int sisi) {
        this.sisi = sisi;    
    }
   
    @Override
    double luas(){
        return sisi * sisi;
    }
    
     @Override
    double keliling(){
        return 4 * sisi;
    }
}
