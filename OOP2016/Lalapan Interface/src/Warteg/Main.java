package Warteg;


public class Main {
    
    public static void main (String[] argv){
        
        Pembeli pe = new Pembeli("KHOIRI");
        pe.tampilData();
        
    Ayam ay = new Ayam("Ayam","Putih","Salat,Timun,Kacang Panjang",1,10000);
        ay.tampilData();
        ay.hitungLalapan();
        ay.bayarLalapan();
        System.out.println("Total Lalapan ="+ay.hitungLalapan());
        System.out.println("Total Lalapan Setelah Tambah ="+ay.tambahLagi());
        System.out.println("Kembalian Bayar lalapan ="+ay.bayarLalapan());
        System.out.println("====================================");
    Bebek be = new Bebek("Bebek","Putih","Salat,Timun",1,12000);
        be.tampilData();
        be.hitungLalapan();
        be.bayarLalapan();
        System.out.println("Total Lalapan ="+be.hitungLalapan());
        System.out.println("Total Lalapan Setelah Tambah ="+be.tambahLagi());
        System.out.println("Kembalian Bayar lalapan ="+be.bayarLalapan());
        System.out.println("====================================");
    Lele le = new Lele("Lele","Putih","|Salat",1,8000);
        le.tampilData();
        le.hitungLalapan();
        le.bayarLalapan();
        System.out.println("Total Lalapan ="+le.hitungLalapan());
        System.out.println("Total Lalapan Setelah Tambah ="+le.tambahLagi());
        System.out.println(" Kembalian Bayar lalapan ="+le.bayarLalapan());
        System.out.println("====================================");
    }
}
