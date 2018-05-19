class Mahasiswa  {

    private String nim;
    private String nama;
    private float ipk;
    private Matakuliah mk;

	
	public String getNim() {
		return nim;
	}


	public void setNim(String nim) {
		this.nim = nim;
	}

	
	public String getNama() {
		return nama;
	}


	public void setNama(String nama) {
		this.nama = nama;
	}


	public float getIpk() {
		return ipk;
	}


	public void setIpk(float ipk) {
		this.ipk = ipk;
	}

	
	public Matakuliah getMk() {
		return mk;
	}


	public void setMk(Matakuliah mk) {
		this.mk = mk;
	}

	
	public Mahasiswa() {
	}

	
	public Mahasiswa(String nim, String nama, float ipk, Matakuliah mk) {
		this.nim = nim;
		this.nama = nama;
		this.ipk = ipk;
		this.mk = mk;
	}

  public void tampilData(){
    System.out.println("NIM : "+nim);
    System.out.println("Nama : "+nama);
    System.out.println("IPK : "+ipk);
    mk.tampilData();
  }

}
