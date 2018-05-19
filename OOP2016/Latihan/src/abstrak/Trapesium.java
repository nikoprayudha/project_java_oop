package abstrak;

public class Trapesium extends BangunDatar{
    public int atas,bawah,tinggi;
   
   public  void hitungLuas(){
       luas = 0.5*(atas+bawah)*tinggi;
   }
   public void hitungKeliling(){
       double s = 0.5*(bawah-atas); 
       double simir = Math.sqrt((s*s)+(tinggi*tinggi));
       keliling = simir + simir + atas + bawah;
   }
}
