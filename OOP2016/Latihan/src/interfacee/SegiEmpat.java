package interfacee;

public class SegiEmpat extends BangunDatar implements Resizeable{
    
    public int panjang,lebar;

    @Override
    public void hitungLuas() {
        this.luas = panjang*lebar;
    }

    @Override
    public void hitungKeliling() {
       this.keliling = (2*panjang)+2*lebar;
    }

    @Override
    public void perbesar() {
        this.panjang = this.panjang * 2;
        this.lebar = this.lebar * 2;
    }

    @Override
    public void perkecil() {
        this.panjang = this.panjang /2;
        this.lebar = this.lebar /2;
    }
    
}
