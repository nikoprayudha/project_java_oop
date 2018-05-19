package persewaan;

public class Main { 
   public static void main(String[]argv){
    Mobil m1 = new Mobil("N 19 AB" ,"Avanza", 5 ,2200);
    Mobil m2 = new Mobil("N 6279 LE" ,"Fortuner", 5 ,3000);
    Mobil m3 = new Mobil("N 5454 JI" ,"Avanza", 5 ,2000);
    
    Mobil[] mArr = {m1,m2,m3};
    AnggotaReguler ar = new AnggotaReguler("A01","Ahmad Bustomi",mArr);
    ar.tampiLData();
       System.out.println("Biaya Pendaftaran :"+ar.hitungBiayaPendaftaran());
       System.out.println("Biaya Sewa :"+ar.hitungBiayaSewa());
       System.out.println("================================================");
    AnggotaPremium ap = new AnggotaPremium("B02","Niko Prayudha",mArr);
    ap.tampiLData();
       System.out.println("Biaya Pendaftaran :"+ap.hitungBiayaPendaftaran());
       System.out.println("Biaya Sewa :"+ap.hitungBiayaSewa());
       System.out.println("================================================");
    AnggotaGold ag = new AnggotaGold("B02","Niko Prayudha",mArr);
    ag.tampiLData();
       System.out.println("Biaya Pendaftaran :"+ag.hitungBiayaPendaftaran());
       System.out.println("Biaya Sewa :"+ag.hitungBiayaSewa());
       System.out.println("================================================");   
    
    
    
       
    }
}
