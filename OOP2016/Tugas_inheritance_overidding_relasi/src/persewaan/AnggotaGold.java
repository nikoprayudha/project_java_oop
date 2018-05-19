package persewaan;

public class AnggotaGold  extends AnggotaReguler{
  
  public AnggotaGold(String id, String nama, Mobil[] mob){
  super(id,nama,mob);
  }
  public double hitungBiayaPendaftaran(){
      return 1000+(0.2*1000);
  }
  public double hitungBiayaSewa(){
      double sewa = super.hitungBiayaPendaftaran();
      sewa = sewa - 0.1*sewa;
      return sewa;
  }
}  
