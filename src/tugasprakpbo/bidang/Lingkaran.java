/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasprakpbo.bidang;

/**
 *
 * @author Acer Aspire
 */
public class Lingkaran {
    double phi = 3.14;
    
    public double luasLingkaran(double jBalok)
    {
        return phi*jBalok*jBalok;
    }
    
    public double kelilingLingkaran(double jBalok)
    {
        return 2*phi*jBalok;
    }

}
