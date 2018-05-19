public class Programmer extends Pegawai{
	public int bonus;

	public Programmer(){
		System.out.println("--------->konsturktor default pegawai<----------");
	}

	public void tampilDataProgrammer(){
		super.tampilDataPokokPegawai();
		System.out.println("Bonus ="+bonus);
		System.out.println("Gaji Total ="+(bonus+super.gaji));
	}
}