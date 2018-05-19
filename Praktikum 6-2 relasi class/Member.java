class Member{
	private String id;
	private String nama;
	private Buku[] buku;

	public Member(){
	}

	public void setId(String id){
		this.id = id;
	}
	public String getId(){
		return id;
	}
	public void setNama(String nama){
		this.nama = nama;
	}
	public String getNama(){
		return nama;
	}
	public void setBuku(Buku[] buku){
		this.buku = buku;
	}
	public Buku[] getBuku(){
		return buku;
	}

   public void tampilBukuTerbaru(){
   	int terbaru=0;
   for (int i=1; i<buku.length; i++){
       if(buku[i].getThTerbit() > buku[terbaru].getThTerbit())
            {
             terbaru = i;
            }
         }
        System.out.println("Buku Yang Paling Baru");
		System.out.println("Judul :"+buku[terbaru].getJudul());
		System.out.println("Thn Terbit :"+buku[terbaru].getThTerbit());		
    }   	

    public void tampilBukuTerlama(){
   	int terlama=0;
   for (int i=1; i<buku.length; i++){
       if(buku[i].getThTerbit() < buku[terlama].getThTerbit())
            {
             terlama = i;
            }
         }
        System.out.println("Buku Yang Paling Lama");
		System.out.println("Judul :"+buku[terlama].getJudul());
		System.out.println("Thn Terbit :"+buku[terlama].getThTerbit());		
    }   	

	public void tampilData(){
		System.out.println("Id :"+id);
		System.out.println("Nama :"+nama);
		for(int i=0; i<buku.length; i++){
			buku[i].tampilData();
			}
	}

}