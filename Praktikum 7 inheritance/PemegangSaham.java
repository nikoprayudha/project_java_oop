public class PemegangSaham extends Manajer{
	public int deviden;

	public PemegangSaham(){
		System.out.println("--------->konsturktor default manajer<----------");
	}
	public PemegangSaham(int deviden, int tunjanganJabatan, String nip,String nama, int gaji, String alamat){
		super(tunjanganJabatan, nip , nama, gaji , alamat);
		System.out.println("--------->konsturktor berparameter manajer<----------");
		this.deviden = deviden;
	}
	public void tampilDataPemegangSaham(){
		super.tampilDataManajer();
		System.out.println("Deviden ="+deviden);
		System.out.println("Gaji Total ="+(gaji+tunjanganJabatan+deviden));			
	}
}