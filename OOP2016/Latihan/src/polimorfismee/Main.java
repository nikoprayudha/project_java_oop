package polimorfismee;

public class Main {
    public static void main(String[] args) {
        Pegawai p = new Pegawai();
        p = new Programmer();//polimorfisme
        p = new Manager();//polimorfisme
        
        //Manager = new Programmer();//tidak bisa karena Programmer bukan subklas Manager
        Manager m = new Manager();
        m.gajiPokok = 10000;
        m.nama = "Niko";
        m.tunjangan = 5000;
        p = m;//polimorfisme
        p.tampilData();//VMI

        
        Pegawai[] arrPeg = new Pegawai[3];
        Programmer pr = new Programmer();
        pr.nama = "Rika";
        pr.gajiPokok = 100000;
        pr.bonus = 120000;
        p = pr;//polimorfisme
        p.tampilData();//VMI

        arrPeg[0] = p;
        arrPeg[1] = pr;
       
        arrPeg[0].tampilData();
        arrPeg[1].tampilData();
        
        hitungGajiTotal(p);
        hitungGajiTotal(pr);
    }
    
    public static void hitungGajiTotal(Pegawai p){
        if(p instanceof Programmer){
           Programmer prog = (Programmer) p;
           int gajiTotal = prog.bonus+prog.gajiPokok;
            System.out.println("Gaji Total :"+gajiTotal);
           } 
        else if(p instanceof Manager){
            Manager man = (Manager) p;
            int gajiTotal = man.tunjangan+man.gajiPokok;  
            System.out.println("Gaji Total :"+gajiTotal);
            }
    }
    
}
