class Matakuliah{
	private String kode;
	private String namaMk;
	private Nilai[] nilai;
	private int sks;

	public Matakuliah(){
	}

	public void setKode(String kode){
		this.kode = kode;
	}
	public String getKode(){
		return kode;
	}
	public void setNamaMk(String namaMk){
		this.namaMk = namaMk;
	}
	public String getNamaMk(){
		return namaMk;
	}
	public void setNilai(Nilai[] nilai){
		this.nilai = nilai;
	}
	public Nilai[] getNilai(){
		return nilai;
	}
	public void setSks(int sks){
		this.sks = sks;
	}
	public int getSks(){
		return sks;
	}

	public void tampilData(){
		System.out.println("Kode"+kode);
		System.out.println("Nama Matakuliah"+namaMk);
		for(int i=0; i<nilai.length; i++){
			nilai[i]=tampilData();
		}
	}

}