/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan.lalapan;

/**
 *
 * @author Falcon
 */
public class Bebek extends Lalapan{
    
    public int harga;
    public int porsi;
    
    @Override
    public void hitungHarga() {
        int total = harga*porsi;
    }

    @Override
    public void rasaSambel() {
        
    }
    
}
