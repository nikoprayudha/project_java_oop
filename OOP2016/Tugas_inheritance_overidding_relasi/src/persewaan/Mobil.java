package persewaan;

public class Mobil {
    public String noPlatMobil,merek;
    public int jam,biayaSewaPerJam;
    
    public Mobil(String noPlatMobil, String merek, int jam, int biayaSewaPerJam){
        this.noPlatMobil = noPlatMobil;
        this.merek = merek;
        this.jam = jam;
        this.biayaSewaPerJam = biayaSewaPerJam;
    }
    
    public void tampilData(){
        System.out.println("No Plat :"+noPlatMobil);
        System.out.println("Merek :"+merek);
        System.out.println("jam :"+jam);
        System.out.println("Biaya Sewa Per-Jam :"+biayaSewaPerJam);
    }
}
