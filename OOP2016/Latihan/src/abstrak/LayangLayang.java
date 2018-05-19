package abstrak;

public class LayangLayang extends BangunDatar{
    public int d1,d2;
   
   public  void hitungLuas(){
       luas = 0.5*d1*d2;
   }
   public void hitungKeliling(){
       double s1 = Math.sqrt((0.3*d1*0.3*d1)+(0.5*d2*0.5*d2));
       double s2 = Math.sqrt((0.6*d1*0.6*d1)+(0.5*d2*0.5*d2));
       keliling = 2*(s1+s2);
   }
}
