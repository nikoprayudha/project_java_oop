public class Pegawai{
	public String nip,nama;
	public int gaji;
	private String alamat;

	public Pegawai(){
		System.out.println("--------->konsturktor default pegawai<----------");
	}
	public Pegawai(String nip, String nama, int gaji , String alamat){
		System.out.println("--------->konsturktor berparameter pegawai<----------");
		this.nip = nip;
		this.nama = nama;
		this.gaji = gaji;
		this.alamat = alamat;	
	}
	public void setAlamat(String alamat){
		this.alamat = alamat;
	}
	public String getAlamat(){
		return alamat;
	}
	public void tampilDataPokokPegawai(){
		System.out.println("Nip "+nip);
		System.out.println("Nama "+nama);
		System.out.println("Alamat "+alamat);
		System.out.println("Gaji Pokok "+gaji);
	}


}