class Pembeli{
	private String nama;
	private Barang brg[];

	public Pembeli(){
	}

	public Pembeli(String nama , Barang brg[] ){
		this.nama = nama;
		this.brg = brg;
	}

	public void setNama(String nama){
		this.nama = nama;
	}
	public String getNama(){
		return nama;
	}

	public void setBrg(Barang brg[]){
		this.brg = brg;
	}
	public Barang[] getBrg(){
		return brg;
	}

    public int hitungTotalBayar(){
    	int total = 0;

    		for(int i=0; i<brg.length; i++){
    			total = total + (brg[i].getHargaSatuan() * brg[i].getJumlah());	 
    	 }

    	 return total;
    }

	public void tampilData(){
		System.out.println("Nama Pembeli :"+nama);
		for(int i=0; i<brg.length; i++){
			brg[i].tampilData();
			}
	}

}