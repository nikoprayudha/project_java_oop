package abstrak;

public class SegiEmpat extends BangunDatar{
    public int panjang,lebar;
  
   public  void hitungLuas(){
       luas = panjang*lebar;
   }
   
   public void hitungKeliling(){
       keliling = 2*(panjang+lebar);
   }
}
