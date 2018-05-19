package abstrak;

public class Main {
    public static void main(String[] args) {
        
       SegiEmpat se = new SegiEmpat();
       se.panjang = 5 ;
       se.lebar = 10 ;
       se.hitungLuas();
       se.hitungKeliling();
        System.out.println("===================================");
        System.out.println("SEGI EMPAT");  
        System.out.println("panjang :"+se.panjang);
        System.out.println("lebar :"+se.lebar);
        System.out.println("Luas SegiEmpat :"+se.luas);
        System.out.println("Keliling SegiEmpat :"+se.keliling);
        System.out.println("==================================="); 
       
       SegitigaSamaKaki ss = new SegitigaSamaKaki();
       ss.alas = 5 ;
       ss.tinggi = 10 ;
       ss.hitungLuas();
       ss.hitungKeliling();
        System.out.println("==================================="); 
        System.out.println("SEGITIGA SAMAKAKI   "); 
        System.out.println("Alas :"+ss.alas); 
        System.out.println("Tinggi :"+ss.tinggi); 
        System.out.println("Luas SegitigaSamaKaki :"+ss.luas);
        System.out.println("Keliling SegitigaSamaKaki :"+ss.keliling);
        System.out.println("===================================");  
       
      Lingkaran l = new Lingkaran();
       l.jariJari = 5 ;
       l.hitungLuas();
       l.hitungKeliling();
        System.out.println("==================================="); 
        System.out.println("LINGKARAN"); 
        System.out.println("Jari Jari :"+l.jariJari); 
        System.out.println("Luas SegitigaSamaKaki :"+l.luas);
        System.out.println("Keliling SegitigaSamaKaki :"+l.keliling);
        System.out.println("===================================");  
        
      LayangLayang ll = new LayangLayang();
       ll.d1 = 5 ;
       ll.d2 = 5 ;
       ll.hitungLuas();
       ll.hitungKeliling();
        System.out.println("===================================");  
        System.out.println("LAYANG LAYANG"); 
        System.out.println("Diagonal 1 :"+ll.d1); 
        System.out.println("Diagonal 2 :"+ll.d2);
        System.out.println("Luas LayangLayang :"+ll.luas);
        System.out.println("Keliling LayangLayang :"+ll.keliling);
        System.out.println("===================================");    
      
      BelahKetupat bk = new BelahKetupat();
       bk.d1 = 5 ;
       bk.d2 = 5 ;
       bk.hitungLuas();
       bk.hitungKeliling();
        System.out.println("==================================="); 
        System.out.println("BELAH KETUPAT"); 
        System.out.println("Diagonal 1 :"+bk.d1); 
        System.out.println("Diagonal 2 :"+bk.d2);
        System.out.println("Luas BelahKetupat :"+bk.luas);
        System.out.println("Keliling BelahKetupat :"+bk.keliling);
        System.out.println("===================================");      
     
      Trapesium t = new Trapesium();
       t.atas = 5 ;
       t.bawah = 10 ;
       t.tinggi = 7 ;
       t.hitungLuas();
       t.hitungKeliling();
        System.out.println("==================================="); 
        System.out.println("TRAPESIUM"); 
        System.out.println("Atas :"+t.atas); 
        System.out.println("Bawah :"+t.bawah);
        System.out.println("Tinggi :"+t.tinggi);
        System.out.println("Luas Trapesium :"+t.luas);
        System.out.println("Keliling Trapesium :"+t.keliling);
        System.out.println("===================================");      
    }
    
}
