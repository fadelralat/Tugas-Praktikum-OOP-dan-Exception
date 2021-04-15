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
public class PersegiPanjang implements MenghitungBidang {
    int pBalok,lBalok,tBalok;
    
    public PersegiPanjang(int pBalok, int lBalok){
        this.pBalok = pBalok;
        this.lBalok = lBalok;
    }
    
    public int luasPersegiPanjang() {
        return pBalok*lBalok;
    }

    public int kelilingPersegiPanjang() {
        return 2*(pBalok+lBalok);
    }

    @Override
    public int luasPersegiPanjang(int pBalok, int lBalok) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int kelilingPersegiPanjang(int pBalok, int lBalok) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
