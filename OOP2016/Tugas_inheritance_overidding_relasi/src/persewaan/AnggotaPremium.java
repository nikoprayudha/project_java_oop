package persewaan;

public class AnggotaPremium  extends AnggotaReguler{
  
  public AnggotaPremium(String id, String nama, Mobil[] mob){
   super(id,nama,mob);
  }
  public double hitungBiayaPendaftaran(){
      return 1000+(0.1*1000);
  }
  public double hitungBiayaSewa(){
      double sewa = super.hitungBiayaPendaftaran();
      sewa = sewa - 0.05*sewa;
      return sewa;
  }
}  
