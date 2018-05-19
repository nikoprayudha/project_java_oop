class Barang{
	String kode,namaBarang;
	int hargaDasar;
	float diskon,hargaJual;

	int hitungHargaJual(int hargaDasar,float hargaJual,float diskon){
			hargaJual = hargaDasar-(diskon*hargaDasar);
			return hargaJual;
	}
	void tampilData(){
		System.out.println("Kode ="+kode);
		System.out.println("Nama Barang ="+namaBarang);
		System.out.println("Harga Dasar ="+hargaDasar);
		System.out.println("Diskon ="+diskon);
		System.out.println("Harga Jual ="+hargaJual);	
	}
	public static void main (String[]args){
		Barang br = new Barang();
		br.kode = "10154";
		br.namaBarang = "Sabun";
		br.hargaDasar = 4500;
		br.diskon = 0.50f;
		br.hargaJual = 4500f;
		br.tampilData();
	}
}