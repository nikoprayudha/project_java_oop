package overloading;

public class Main {
    public static void main(String[] args) {
        System.out.println("LINGKARAN");
        Lingkaran l = new Lingkaran();
        l.hitungLuas(14);
        l.hitungKeliling(14);
        l.tampilData();
        
        System.out.println("---------------------");
        System.out.println("SEGITIGA SAMAKAKI");
        SegitigaSamaKaki sg = new SegitigaSamaKaki();
        sg.hitungLuas(8,3);
        sg.hitungKeliling(8,3);
        sg.tampilData();
        
        System.out.println("---------------------");
        System.out.println("SEGI EMPAT");
        SegiEmpat se = new SegiEmpat();
        se.hitungLuas(5,8);
        se.hitungKeliling(5,8);
        se.hitungDiagonal(5,8);
        se.tampilData();
    }
}
