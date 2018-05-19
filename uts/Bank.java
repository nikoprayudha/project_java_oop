class Bank {
	private String nama;
	private String alamat;
	public Nasabah[] nasabah;

	public Bank(){
	}

	public Bank(String nama , String alamat, Nasabah[] nasabah){
		this.nama = nama;
		this.alamat = alamat;
		this.nasabah = nasabah;
	}

	public void setNama(String nama){
		this.nama = nama;		
	}
	public String getNama(){
		return nama;
	}
	public void setAlamat(String alamat){
		this.alamat = alamat;
	}
	public String getAlamat(){
		return alamat;
	}
	public void setNasabah(Nasabah[] nasabah){
		this.nasabah = nasabah;
	}
	public Nasabah[] getNasabah(){
		return nasabah;
	}

	public void saldoTerbesar(){
		int terbesar = 0;
		int i;
		for(i=1; i<nasabah.length; i++){
			if(nasabah[i].getAkun().getSaldo() > nasabah[terbesar].getAkun().getSaldo()) {
				terbesar = i;
			}
		}
		System.out.println("Nasabah Saldo Terbesar");
		System.out.println("Id = "+nasabah[terbesar].getId());
		System.out.println("Nama = "+nasabah[terbesar].getNama());
		System.out.println("Nomer Rekening = "+nasabah[terbesar].getAkun().getNoRek());
		System.out.println("Saldo = "+nasabah[terbesar].getAkun().getSaldo());
	}

	public void tampilDataBank(){
		System.out.println("Nama Bank :"+nama);
		System.out.println("Alamat :"+alamat);
		System.out.println("------------------------");	
		for(int j=0; j<nasabah.length; j++){
			nasabah[j].tampilDataNasabah() ;
			System.out.println("Saldo setelah Tarik = "+nasabah[j].tarikSaldo(50000));
			System.out.println("Saldo setelah Setor = "+nasabah[j].setorSaldo(100000));
			System.out.println("--------------------");
		    }					
	}
 

}