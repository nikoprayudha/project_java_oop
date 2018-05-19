class DemoDokterObatPasien {
	public static void main(String [] args){
	Dokter d = new Dokter("Dr.Okin",2000);
	Obat o = new Obat("SpritBodrex",1000);
	Pasien p = new Pasien("Udin",d,o);
	p.tampilData();
	System.out.println("Total Biaya = " +p.hitungTotalBiaya()); 
	}
}