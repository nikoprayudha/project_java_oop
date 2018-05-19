class PersegiPanjang {
	int panjang;
	int lebar;
    int luas;
    int keliling;

	int hitungLuas(int panjang , int lebar){
		 luas = panjang * lebar;
		 return luas;
	}

	int hitungKeliling(int panjang , int lebar){
		 keliling = 2*(panjang+lebar);
		 return keliling;
	}

	void tampilData(){
	System.out.println("Hasil Luas ="+luas);
	System.out.println("Hasil Keliling ="+keliling);
	}
	public static void main (String[]args){
	PersegiPanjang pp = new PersegiPanjang();
	pp.hitungLuas(5,10);
	pp.hitungKeliling(5,10);
	pp.tampilData();
	}

}