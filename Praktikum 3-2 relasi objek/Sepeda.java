public class Sepeda{
	public String kode;
	protected String merek;
	String jenis;
	private float kecepatan;
	private int gigi;
		public void start(){
			gigi = 1; kecepatan =0;
		}
		private void kurangGigi(){
			gigi--;
		}
		private void tambahGigi(){
			gigi++;
		}
		public void tambahKecepatan(float v){
			kecepatan += v;
			if(v > 10)
				tambahGigi();
		}
		public void kurangiKecepatan(float v){
			kecepatan -= v;
			if(v > 5.5)
				kurangGigi();
		}
		public void stop() {
			kecepatan = 0; gigi=0;
		}
		public void tampilData(){
			System.out.println("KODE ="+kode);
			System.out.println("MEREK ="+merek);
			System.out.println("JENIS ="+jenis);
			System.out.println("KECEPATAN ="+kecepatan);
			System.out.println("GIGI ="+gigi);
		}
		public static void main(String [] args){
		Sepeda s1 = new Sepeda();
		s1.kode="N19AB"; s1.merek="VESPA"; s1.jenis="matic"; s1.kecepatan=0;
		s1.gigi=0;
		s1.start();
		s1.tambahKecepatan(15); s1.kurangiKecepatan(3);
		s1.tampilData();	
		}
}