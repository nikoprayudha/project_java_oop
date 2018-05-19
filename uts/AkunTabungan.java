class AkunTabungan{
	private String noRek;
	private int saldo;

	public AkunTabungan(){
	}

	public AkunTabungan(String noRek, int saldo){
		this.noRek = noRek;
		this.saldo = saldo;
	}
	public void setNoRek(String noRek){
		this.noRek = noRek;
	}
	public String getNoRek(){
		return noRek;
	}
	public void setSaldo(int saldo){
		this.saldo = saldo;
	}
	public int getSaldo(){
		return saldo;
	}

	public void tampilDataAkun(){
		System.out.println("No Rekening :"+noRek);
		System.out.println("Saldo :"+saldo);
	}

}