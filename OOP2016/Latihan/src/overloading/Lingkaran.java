package overloading;

public class Lingkaran extends BangunDatar{
    public double jariJari;
    
    @Override
    public void hitungLuas(){
        luas = 3.14*jariJari*jariJari;
    }
    public void hitungLuas(double jariJari){
        this.jariJari = jariJari;
        luas = 3.14*jariJari*jariJari;
    }
    @Override
    public void hitungKeliling(){
        keliling = 2*3.14*jariJari;
    }
    public void hitungKeliling(double jariJari){
        this.jariJari = jariJari;
        keliling = 2*3.14*jariJari;
    }
    
    @Override
    public void tampilData(){
        System.out.println("Jari Jari :"+jariJari);  
        super.tampilData();
    }
    
}
