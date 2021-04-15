/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasprakpbo.ruang;

import tugasprakpbo.bidang.Lingkaran;
/**
 *
 * @author Acer Aspire
 */
public class Kerucut extends Lingkaran {
    
        double phi = 3.14;
        double jKerucut,tKerucut;
    
    public Kerucut(double jKerucut, double tKerucut){
        this.jKerucut = jKerucut;
        this.tKerucut = tKerucut;
    }
    
    /**
     *
     * @param jKerucut
     * @return
     */
    
    @Override
    public double luasLingkaran(double jKerucut) {
        return super.luasLingkaran(jKerucut);
    }
    
    public double luasPermukaanKerucut(){
        double s;
        s = Math.pow(((jKerucut*jKerucut)+(tKerucut*tKerucut)), .5);
        return (phi*jKerucut*s)+luasLingkaran(jKerucut);
    }
    
    public double volumeKerucut(){
        return 0.3*luasLingkaran(jKerucut)*tKerucut;
    }
    
}
