package Warteg;

public class Ayam extends Lalapan implements PesanLagi{
 public String nama,nasi,sayuran;
 public int jumlah;
 public double harga,bayar;
 
    public Ayam(){
    }
    public Ayam(String nama,String nasi, String sayuran,int jumlah,int harga){
        this.nama = nama;
        this.nasi = nasi;
        this.sayuran = sayuran;
        this.jumlah = jumlah;
        this.harga = harga;
    }
    @Override
    public double hitungLalapan() {
         return harga*jumlah;     
    }
    
   @Override
    public double tambahLagi() {
        return 2*(harga*jumlah);  
    }
    
    @Override
    public double bayarLalapan(){
       
     bayar = 50000 - (hitungLalapan()+tambahLagi());
     return bayar;
    }
    
    public void tampilData(){
        System.out.println("Lauk :"+nama);
        System.out.println("Nasi :"+nasi);
        System.out.println("Sayuran :"+sayuran);
        System.out.println("Jumlah :"+jumlah);
        System.out.println("Harga :"+harga);
        
    }

    
}
