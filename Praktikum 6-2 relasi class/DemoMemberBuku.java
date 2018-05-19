class DemoMemberBuku{

	public static void main(String[]args){

		Buku bk1 = new Buku();
		bk1.setKode("01");
		bk1.setJudul("Anak Jalanan The Series Eps 1");
		bk1.setPengarang("Azima");
		bk1.setThTerbit(2014);

		Buku bk2 = new Buku();
		bk2.setKode("02");
		bk2.setJudul("Anak Jalanan The Series Eps 2");
		bk2.setPengarang("Azima");
		bk2.setThTerbit(2015);

		Buku bk3 = new Buku();
		bk3.setKode("03");
		bk3.setJudul("Anak Jalanan The Series Eps 3");
		bk3.setPengarang("Azima");
		bk3.setThTerbit(2016);

		Buku bArr[] = {bk1,bk2,bk3};
		
		Member m = new Member();
		m.setId("1541180070");
		m.setNama("Niko Ary Prayudha");
		m.setBuku(bArr);
		m.tampilData();
		m.tampilBukuTerbaru();	
		m.tampilBukuTerlama();	
	}
}