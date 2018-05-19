class Dokter  {
   private String namaDr;
   private int tarifDr;

	public Dokter() {
	}

	public Dokter(String namaDr, int tarifDr) {
		this.namaDr = namaDr;
		this.tarifDr = tarifDr;
	}
	public void setNamaDr(String namaDr){
		this.namaDr = namaDr;
	}
	public String getNamaDr(){
		return namaDr;
	}
	public void setTarifDr(int tarifDr){
		this.tarifDr = tarifDr;
	}
	public int getTarifDr(){
		return tarifDr;
	}

 public void tampilData(){
    System.out.println("Nama Dokter : "+namaDr);
    System.out.println("Tarif Dokter : "+tarifDr);
  }

}
