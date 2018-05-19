
package overriding;

public class Main {
    public static void main(String[] args) {
        System.out.println("LINGKARAN");
        Lingkaran l = new Lingkaran(14);
        l.hitungLuas();
        l.hitungKeliling();
        l.tampilData();
        
        System.out.println("---------------------");
        System.out.println("SEGITIGA SAMAKAKI");
        SegitigaSamaKaki sg = new SegitigaSamaKaki(8 , 3);
        sg.hitungLuas();
        sg.hitungKeliling();
        sg.tampilData();
        
        System.out.println("---------------------");
        System.out.println("SEGI EMPAT");
        SegiEmpat se = new SegiEmpat(5 , 8);
        se.hitungLuas();
        se.hitungKeliling();
        se.hitungDiagonal();
        se.tampilData();
    }
}
