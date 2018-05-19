public class SepedaDemo {
	public static void main(String [] args){
		Sepeda s1 = new Sepeda();
		s1.kode="N19AB"; s1.merek="VESPA"; s1.jenis="matic"; s1.kecepatan=0;
		s1.gigi=0;
		s1.start();
		s1.tambahKecepatan(15); s1.kurangiKecepatan(3);
		s1.tampilData();	
		}
}