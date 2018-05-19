package persewaan;

public class AnggotaReguler {
    public String id,nama;
    public Mobil[] mob;
    
 public AnggotaReguler(String id, String nama, Mobil[] mob){
  this.id = id;
  this.nama = nama;
  this.mob = mob;
 }
 
 public double hitungBiayaPendaftaran(){
     return 1000;
 }
 
 public double hitungBiayaSewa(){
      double sewa = 0;
      for(int i=0; i<mob.length;i++){
      sewa += mob[i].biayaSewaPerJam *mob[i].jam;
      }
     return sewa; 
 }

 public void tampiLData(){
     System.out.println("Id Member :"+id);
     System.out.println("Nama Member :"+nama);
     System.out.println("Daftar Mobil yang Di Pinjam");
     for(int i=0;i<mob.length;i++){
         mob[i].tampilData();
     }
  }
}
