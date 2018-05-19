public class MainBank {	

	public static void main(String[]args){
		
		AkunTabungan at1 = new AkunTabungan("N 19 AB",100000);
		Nasabah n1 = new Nasabah("A1","Adi",at1);
		
		AkunTabungan at2 = new AkunTabungan("D15T41C",200000);
		Nasabah n2 = new Nasabah("B2","Ali",at2);
		
					
		Nasabah nsbArr[] = {n1,n2};

		Bank b = new Bank("Bank Rakyat Kita","Malang",nsbArr);
		b.tampilDataBank();
		b.saldoTerbesar();
	
	}
}
