package interfacee;

public class Main {
    public static void main(String[] args) {
        SegiEmpat se = new SegiEmpat();
        se.lebar = 10;
        se.panjang = 10;
        se.hitungKeliling();
        se.hitungLuas();
        System.out.println("Luas Sebelum Diperbesar "+se.luas);
        System.out.println("Keliling Sebelum Diperbesar"+se.keliling);
        se.perbesar();
        se.hitungKeliling();
        se.hitungLuas();
        System.out.println("Luas Setelah Diperbesar "+se.luas);
        System.out.println("Keliling Setelah Diperbesar"+se.keliling);
    }
}
