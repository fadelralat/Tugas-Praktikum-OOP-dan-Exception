/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasprakpbo;
import tugasprakpbo.bidang.PersegiPanjang;
import tugasprakpbo.ruang.Balok;
import tugasprakpbo.ruang.Kerucut;
import java.util.Scanner;

/**
 *
 * @author Acer Aspire
 */
public class TugasPrakPBO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner (System.in);
        
        int pBalok, lBalok, tBalok, sisi;
        double jKerucut, tKerucut, r, jBola, phi = 3.14;
        char pilih,ulang;
        
        do{
        System.out.println("+++++++++++++++++++++");
        System.out.println("+-------MENU--------+");
        System.out.println("+++++++++++++++++++++");
        System.out.println("1. Balok");
        System.out.println("2. Kubus");
        System.out.println("3. Kerucut");
        System.out.println("4. Bola");
        System.out.println("5. Lingkaran");
        System.out.println("6. Persegi");
        System.out.println("0. Selesai");
        System.out.print("Pilih : ");
        pilih = scanner.next().charAt(0);
        System.out.println("+++++++++++++++++++++");
        
        switch(pilih){
                case '1':
                    scanner = new Scanner (System.in);
                    System.out.print("Masukkan Panjang : ");
                    pBalok = scanner.nextInt();
                    System.out.print("Masukkan Lebar   : ");
                    lBalok = scanner.nextInt();
                    System.out.print("Masukkan Tinggi  : ");
                    tBalok = scanner.nextInt();
                    
                    PersegiPanjang bidang = new PersegiPanjang(pBalok,lBalok);
                    Balok ruang = new Balok(pBalok, lBalok, tBalok);
                    
                    System.out.println("+++++++++++++++++++++");
                    System.out.println("Luas Persegi Panjang     : " + bidang.luasPersegiPanjang());
                    System.out.println("Keliling Persegi Panjang : " + bidang.kelilingPersegiPanjang());
                    System.out.println("Luas Permukaan Balok : "+ ruang.luasPermukaanBalok());
                    System.out.println("Volume Balok         : "+ ruang.volumeBalok());
                    break;

                case '2':
                    int luaskubus = 0, kelilingkubus = 0, luaspermukaankubus = 0, volumekubus = 0;
                    scanner = new Scanner (System.in);

                    try {
                        System.out.print("Masukkan Sisi : ");
                        sisi = scanner.nextInt();

                        luaskubus = sisi*sisi;
                        kelilingkubus = 4*sisi;
                        luaspermukaankubus = sisi * sisi * 6;
                        volumekubus = sisi * sisi * sisi;

                    } catch (Exception error) {
                        System.out.println("Masukkan angka bukan huruf");
                    }
                        System.out.println("+++++++++++++++++++++");
                        System.out.println("Luas Persegi         : " + luaskubus);
                        System.out.println("Keliling Persegi     : " + kelilingkubus);
                        System.out.println("Luas Permukaan Kubus : "+ luaspermukaankubus);
                        System.out.println("Volume Kubus         : "+ volumekubus);
                    break;

                case '3':
                    scanner = new Scanner (System.in);
                    System.out.print("Masukkan Jari-Jari : ");
                    jKerucut = scanner.nextDouble();
                    System.out.print("Masukkan Tinggi    : ");
                    tKerucut = scanner.nextDouble();
                    
                    Kerucut hasilKerucut = new Kerucut(jKerucut, tKerucut);
                    
                    System.out.println("+++++++++++++++++++++");
                    System.out.println("Luas Lingkaran     : " + hasilKerucut.luasLingkaran(jKerucut));
                    System.out.println("Keliling Lingkaran : " + hasilKerucut.kelilingLingkaran(jKerucut));
                    System.out.println("Luas Permukaan Kerucut : " + hasilKerucut.luasPermukaanKerucut());
                    System.out.println("Volume Kerucut         : " + hasilKerucut.volumeKerucut());
                    break;

                case '4':
                    double luasbola = 0, kelilingbola = 0, luaspermukaanbola = 0, volumebola = 0;
                    scanner = new Scanner (System.in);

                    try {
                        System.out.print("Masukkan Jari - Jari Bola : ");
                        jBola = scanner.nextInt();

                        luasbola = phi * jBola * jBola;
                        kelilingbola = 2 * phi * jBola;
                        luaspermukaanbola = 4 * phi * jBola * jBola;
                        volumebola = 4/3 * phi * jBola * jBola * jBola;

                    } catch (Exception error) {
                        System.out.println("Masukkan angka bukan huruf");
                    }
                        System.out.println("+++++++++++++++++++++");
                        System.out.println("Luas Lingkaran Bola     : " + luasbola);
                        System.out.println("Keliling Lingkaran Bola : " + kelilingbola);
                        System.out.println("Luas Permukaan Bola     : "+ luaspermukaanbola);
                        System.out.println("Volume Bola             : "+ volumebola);
                    break;
                    
                case '5':
                    System.out.print("Masukkan Jari - Jari : ");
                    r = scanner.nextDouble();
                    Lingkaran2 hasillingkaran = new Lingkaran2(r);
                    System.out.println("+++++++++++++++++++++");
                    System.out.println("Luas Lingkaran " + hasillingkaran.luas());
                    System.out.println("Keliling Lingkaran " + hasillingkaran.keliling());
                    break;
                case '6':
                    System.out.print("Masukkan Sisi : ");
                    sisi = scanner.nextInt();
                    Persegi hasilpersegi = new Persegi(sisi);
                    System.out.println("+++++++++++++++++++++");
                    System.out.println("Luas Lingkaran " + hasilpersegi.luas());
                    System.out.println("Keliling Lingkaran " + hasilpersegi.keliling());
                    break; 
                    
                case '0' :
                    System.out.println("Terima Kasih");
                    System.exit(0);
                    break;
                        
        }
        
        System.out.println("+++++++++++++++++++++");
        System.out.print("Kembali ke menu? (y/n) : ");
        ulang = scanner.next().charAt(0);
        System.out.println("+++++++++++++++++++++");
        ulang = Character.toUpperCase(ulang);
        }while (ulang == 'Y');
    }
    
}
