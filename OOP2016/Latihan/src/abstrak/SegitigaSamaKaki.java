package abstrak;

public class SegitigaSamaKaki extends BangunDatar{
    public int alas,tinggi;
   
   public  void hitungLuas(){
       luas = 0.5*alas*tinggi;
   }
   public void hitungKeliling(){
       double simir = Math.sqrt((0.5*alas*0.5*alas)+(tinggi*tinggi));
       keliling = (2*simir)+alas;
   }
}
