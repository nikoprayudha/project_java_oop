 class Parkir {
  String noKendaraan;
  int jamMasuk,jamKeluar;
  int lamaParkir;
  int biaya; 

   void tampilData(){
   System.out.println("Nomor Kendaraan = "+noKendaraan);
   System.out.println("Jam Masuk = "+jamMasuk);
   System.out.println("Jam Keluar = "+jamKeluar);
   System.out.println("Lama Parkir = "+hitungLamaParkir());
   System.out.println("Biaya = "+hitungBiaya());
   }

   int hitungLamaParkir(){

   			lamaParkir= jamKeluar-jamMasuk;
   			return lamaParkir;
   	}
   	 
   int hitungBiaya() {
      if(hitungLamaParkir()<3)
      {
         biaya=5000;
      }
      else if(hitungLamaParkir()>=3){
          biaya = 5000 + (4000 * (hitungLamaParkir() - 2) );
          
      }return biaya;
}
    
public static void main(String [] args) {
  Parkir p  = new Parkir();
  p.noKendaraan = "N 19 AB";
  p.jamMasuk =1;
  p.jamKeluar =5;
  p.tampilData();
  p.hitungLamaParkir();
  p.hitungBiaya();
   }

 }