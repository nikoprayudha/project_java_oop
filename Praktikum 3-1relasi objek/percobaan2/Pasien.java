class Pasien {

    String nama;
    String alamat;
    String jenis;

    public static void main(String[] args) {
        Pasien tobanga = new Pasien();
        tobanga.nama = "Ivan FP";
        tobanga.alamat = "Malang";
        tobanga.jenis = "umum";
        tobanga.tampilData();
    }

    void tampilData(){
        System.out.println("Nama : " + nama);
        System.out.println("Alamat : "+alamat);
        System.out.println("Jenis : " +jenis);
        hitungTotalBiaya(0);
    }

    int hitungTotalBiaya(int hitung){
        hitung = hitungTarifDokter(0) + hitungTarifObat(0);
        System.out.println("Total Biaya : "+ hitung);
        return hitung;
    }

    int hitungTarifDokter(int hitung){
        if (jenis == "umum") {
            hitung = hitung + 7500;
            System.out.println("Total tarif Dokter : "+ hitung);
        }else if(jenis == "asuransi"){
            hitung = hitung + 0;
            System.out.println("Total tarif Dokter : "+ hitung);
        }
        return hitung;
    }

    int hitungTarifObat(int hitung){
        if (jenis == "umum") {
            hitung = hitung + 15000;
            System.out.println("Total tarif Obat : "+ hitung);
        }else if(jenis == "asuransi"){
            hitung = hitung + 12000;
            System.out.println("Total tarif Obat : "+ hitung);
        }
        return hitung;
    }
}
