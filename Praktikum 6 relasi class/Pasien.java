class Pasien {
  public String namaPasien;
   private Dokter dr;
   private Obat ob;
   int totalBiaya;

	public Pasien() {
	}
  
  public Dokter getDr(){
    return dr;
  }
  public void setDr( Dokter dr){
    this.dr = dr;
  } 

  public Obat getOb(){
    return ob;
  }
  public void setOb( Obat ob){
     this.ob = ob;
  }

  public int hitungTotalBiaya(){
    return dr.getTarifDr() + ob.getHarga();
  }

	public Pasien(String namaPasien, Dokter dr, Obat ob) {
		this.namaPasien = namaPasien;
    this.dr = dr;
    this.ob = ob;
	}

  public void tampilData(){
    System.out.println("Nama Pasien : "+namaPasien);
    dr.tampilData();
    ob.tampilData();
    
  }

}
