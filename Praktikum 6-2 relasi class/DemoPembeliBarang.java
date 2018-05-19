class DemoPembeliBarang{
	public static void main(String[] args){
		Barang br1 = new Barang("Sabun",3000,1);
		Barang br2 = new Barang("Shampo",1000,1);
		Barang br3 = new Barang("Sikat",5000,1);
		Barang brArr[] = {br1,br2,br3};

		Pembeli p = new Pembeli("Niko Prayudha",brArr);
		p.tampilData();
		System.out.println("Total Bayar :"+p.hitungTotalBayar());			
	}
}