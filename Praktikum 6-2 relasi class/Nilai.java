class Nilai{
	private double q1;
	private double q2;
	private double uts;
	private double uas;
	private double tugas;

	public Nilai(){
	}

	public void setQ1(double q1){
		this.q1 = q1;
	}
	public double getQ1(){
		return q1;
	}
	public void setQ2(double q2){
		this.q2 = q2;
	}
	public double getQ2(){
		return q2;
	}
	public void setUts(double uts){
		this.uts = uts;
	}
	public double getUts(){
		return uts;
	}
	public void setUas(double uas){
		this.uas = uas;
	}
	public double getUas(){
		return uas;
	}
	public void setTugas(double tugas){
		this.tugas = tugas;
	}
	public double getTugas(){
		return tugas;
	}

	public int hitungNilaiTotal(){
		int total = 0;
		total = total + ((0.15*q1)+(0.15*q2)+(0.25*uts)+(0.35*uas)+(0.1*tugas));
	
		return total;
	}

	public void tampilData(){
		System.out.println("Nilai Quis 1"+q1);
		System.out.println("Nilai Quis 2"+q2);
		System.out.println("Nilai Uts"+uts);
		System.out.println("Nilai Uas"+uas);
		System.out.println("Nilai Tugas"+tugas);
	}
	
}