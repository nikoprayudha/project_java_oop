package abstrak;

public class BelahKetupat extends BangunDatar{
    public int d1,d2;

   public  void hitungLuas(){
       luas = 0.5*d1*d2;
   }
   public void hitungKeliling(){
        keliling =  Math.sqrt((0.5*d1*0.5*d1)+(0.5*d2*0.5*d2))*4;  
   }
}
