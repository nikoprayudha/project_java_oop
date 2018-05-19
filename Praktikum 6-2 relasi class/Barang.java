class Barang {
	private String namaBrg;
	private int hargaSatuan;
	private int jumlah;

	public Barang(){
	}

	public Barang(String namaBrg, int hargaSatuan, int jumlah){
		this.namaBrg = namaBrg;
		this.hargaSatuan = hargaSatuan;
		this.jumlah = jumlah;
	}

	public void setNamaBrg(String namaBrg){
			this.namaBrg = namaBrg;
	}
	public String getNamaBrng(){
		return namaBrg;
	}

	public void setHargaSatuan(int hargaSatuan){
			this.hargaSatuan = hargaSatuan;
	}
	public int getHargaSatuan(){
		return hargaSatuan;
	}

	public void setJumlah(int jumlah){
			this.jumlah = jumlah;
	}
	public int getJumlah(){
		return jumlah;
	}	

	public void tampilData(){
		System.out.println("Nama Barang :"+namaBrg);
		System.out.println("Harga Satuan :"+hargaSatuan);
		System.out.println("Jumlah:"+jumlah);
		}		

}
