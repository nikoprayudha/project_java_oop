class Rekening {

    String noRek;
    String namaNasabah;
    String alamat;
    int saldo;

    public static void main(String[] args) {
        Rekening nasabah = new Rekening();
        nasabah.noRek = ("12891");
        nasabah.namaNasabah = ("TangaBoys");
        nasabah.alamat = ("Ndarungan");
        nasabah.saldo = 50000;
        nasabah.tampilData();
    }

    void tampilData(){
        System.out.println(noRek);
        System.out.println(namaNasabah);
        System.out.println(alamat);
        System.out.println(tarik(10000));
        System.out.println(setor(20000));
    }

    int tarik (int uang){
        uang = saldo - uang;
        return uang;
    }

    int setor (int uang){
        uang = saldo + uang;
        return uang;
    }

}
