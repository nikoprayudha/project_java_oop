class Matakuliah {
  private String kodeMk;
  private String namaMk;
  private int sks;

	public Matakuliah() {
	}
	
	public Matakuliah(String kodeMk, String namaMk, int sks) {
		this.kodeMk = kodeMk;
		this.namaMk = namaMk;
		this.sks = sks;
	}

	public String getKodeMk() {
		return kodeMk;
	}

	public void setKodeMk(String kodeMk) {
		this.kodeMk = kodeMk;
	}

	public String getNamaMk() {
		return namaMk;
	}

	public void setNamaMk(String namaMk) {
		this.namaMk = namaMk;
	}

	public int getSks() {
		return sks;
	}
    public void setSks(int sks) {
		this.sks = sks;
	}

  public void tampilData(){
    System.out.println("Kode Matkul : "+kodeMk);
    System.out.println("Nama Matkul : "+namaMk);
    System.out.println("SKS : "+sks);
  }

}
