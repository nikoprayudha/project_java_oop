class Processor {
	public String merk;
	public double cache;
	public double clock;

	public Processor{
	}

	public Processor(String me, double ca , double cl){
		merk - me;
		cache - ca;
		clock - cl;
	}

	public void tampilData(){
		System.out.println("Merk Processor = "+merk);
		System.out.println("Cache Memory = "+cache);
		System.out.println("Kecepatan clock = "+clock);
			
	}
}