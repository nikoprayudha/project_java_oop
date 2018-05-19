class Buku {
	private String kode;
	private String judul;
	private String pengarang;
	private int thTerbit;

	public Buku(){
	}

	public void setKode(String kode){
		this.kode = kode;
	}
	public String getKode(){
		return kode;
	}
	public void setJudul(String judul){
		this.judul = judul;
	}
	public String getJudul(){
		return judul;
	}
	public void setPengarang(String pengarang){
		this.pengarang = pengarang;
	}
	public String getPengarang(){
		return pengarang;
	}
	public void setThTerbit(int thTerbit){
		this.thTerbit = thTerbit;
	}
	public int getThTerbit(){
		return thTerbit;
	}
	

	public void tampilData(){
		System.out.println("Kode :"+kode);
		System.out.println("Judul :"+judul);
		System.out.println("Pengarang :"+pengarang);
		System.out.println("Tahun Terbit :"+thTerbit);
	}

}