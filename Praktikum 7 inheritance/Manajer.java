public class Manajer extends Pegawai{
	public  int tunjanganJabatan;

	public Manajer(){
		System.out.println("--------->konsturktor default manajer<----------");
	}
	public Manajer(int tunjanganJabatan, String nip, String nama, int gaji, String alamat){
		super(nip,nama,gaji,alamat);
		System.out.println("--------->konsturktor berparameter manajer<----------");
		this.tunjanganJabatan = tunjanganJabatan;	
	}
	public void tampilDataManajer(){
		super.tampilDataPokokPegawai();
		System.out.println("Tunjangan Jabatan ="+tunjanganJabatan);
		System.out.println("Gaji Total ="+(tunjanganJabatan+gaji));	
	}
}
