package interfacee;

public class SegitigaSamaKaki extends BangunDatar implements Resizeable{
    
    public int alas,tinggi;

    @Override
    public void hitungLuas() {
        this.luas = 0.5 * alas * tinggi;
    }

    @Override
    public void hitungKeliling() {
       double simir = Math.sqrt((0.5*alas*0.5*alas)+(tinggi*tinggi));
       keliling = (2*simir)+alas;
    }

    @Override
    public void perbesar() {
        this.alas = this.alas * 2;
        this.tinggi = this.tinggi * 2;
    }

    @Override
    public void perkecil() {
        this.alas = this.alas /2;
        this.tinggi = this.tinggi /2;
    }
    
}
