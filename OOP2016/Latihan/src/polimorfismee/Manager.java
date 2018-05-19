package polimorfismee;

public class Manager extends Pegawai{
    public int tunjangan;
    
    @Override
    public void tampilData(){
        super.tampilData();
        System.out.println("Tunjangan :"+tunjangan);
    }
}
