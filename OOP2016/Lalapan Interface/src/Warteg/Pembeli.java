package Warteg;

public class Pembeli {
    public String namaPem;
    
    public Pembeli(String namaPem){
        this.namaPem = namaPem;   
    }
    //public double totalan(){
        // double Bayar =(hitungLalapan()+tambahLagi());
      //  return bayar;
    //}
    public void tampilData(){
        System.out.println("Nama Pembeli :"+namaPem);
        
    }
}
