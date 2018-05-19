class Obat  {
   private String namaObat;
   private int harga;
	public Obat() {
	}
	public Obat(String namaObat, int harga) {
		this.namaObat = namaObat;
		this.harga = harga;
	}
	public void setNamaObat(String namaObat){
		this.namaObat = namaObat;
	}
	public String getNamaObat(){
		return namaObat;
	}
	public void setHarga(int harga){
		this.harga = harga;
	}
	public int getHarga(){
		return harga;
	}

 public  void tampilData(){
    System.out.println("Nama Obat "+namaObat);
    System.out.println("Harga Obat "+harga);
  }

}
