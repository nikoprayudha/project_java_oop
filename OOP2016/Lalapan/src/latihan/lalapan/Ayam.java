/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan.lalapan;

/**
 *
 * @author Falcon
 */
public abstract class Ayam extends Lalapan {
 double jumlah,harga,hitung;
    
    
    public void tampilData() {
        System.out.println("Nasi "+ nasi + "porsi");
        System.out.println("Jumlah"+ jumlah );
        System.out.println("Harga"+harga);
        hitungHargaLalapan();
    }

    
    public void hitungHargaLalapan() {
        hitung = jumlah*harga;
        System.out.println("Total Biaya"+hitung);
    }

    
    public void gorengLalapan() {
        System.out.println("Goreng Ayam gan");
    }    
    
 @Override
    public void rasaSambel() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
