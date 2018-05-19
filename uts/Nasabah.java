class Nasabah{
	private String id;
	private String nama;
	public AkunTabungan akun;

	public Nasabah(){
	}
	public Nasabah(String id, String nama, AkunTabungan akun){
		this.id = id;
		this.nama =nama;
		this.akun = akun;	
	}

	public void setId(String id){
		this.id = id;
	}
	public String getId(){
		return id;
	}
	public void setNama(String nama){
		this.nama = nama;
	}
	public String getNama(){
		return nama;
	}
	public void setAkun(AkunTabungan akun){
		this.akun = akun;
	}
	public AkunTabungan getAkun(){
		return akun;
	}

	public int tarikSaldo(int tarik){
		akun.setSaldo(akun.getSaldo()-tarik);
		
		return akun.getSaldo();
	}

	public int setorSaldo(int setor){
		akun.setSaldo(akun.getSaldo()+setor);
		return akun.getSaldo();
	}
	
	public void tampilDataNasabah(){
		System.out.println("Id :"+id);
		System.out.println("Nama Nasabah :"+nama);
		akun.tampilDataAkun();
	}

}