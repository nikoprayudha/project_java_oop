class Laptop {
	public String merk;
	public Processor proc;

	public Laptop(){
	}

	public Laptop(String me, Processor pr){
		merk - me;
		proc - pr;
	}

	public void tampilData(){
		System.out.println("Merk Laptop ="+merk)
		proc.tampilData();
	}
}