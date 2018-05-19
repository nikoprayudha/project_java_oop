package overriding;

public class Lingkaran extends BangunDatar{
    public double jariJari;
    
    public Lingkaran(double jariJari){
        this.jariJari = jariJari;
    }
    @Override
    public void hitungLuas(){
        luas = 3.14*jariJari*jariJari;
    }
    @Override
    public void hitungKeliling(){
        keliling = 2*3.14*jariJari;
    }
    @Override
    public void tampilData(){
        System.out.println("Jari Jari :"+jariJari);  
        super.tampilData();
    }  
}
