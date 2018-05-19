package interfacee;

public class Lingkaran extends BangunDatar implements Resizeable{
    
    public int jariJari;

    @Override
    public void hitungLuas() {
           luas = 3.14*jariJari*jariJari;
    }

    @Override
    public void hitungKeliling() {
       keliling = 2*3.14*jariJari;
    }

    @Override
    public void perbesar() {
        this.jariJari = 2*this.jariJari;
        
    }

    @Override
    public void perkecil() {
        this.jariJari = (int) (0.5*this.jariJari);
       
    }
    
}
