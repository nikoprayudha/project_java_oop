class Lingkaran {
    float phi;
    float r;

    public static void main(String[] args) {
        Lingkaran bunder = new Lingkaran();
        bunder.phi=3.14f;
        bunder.r=21;
        bunder.hitungLuas(0);
        bunder.hitungKeliling(0);
    }

    float hitungLuas(float luas){
        luas = phi*r*r;
        System.out.println(luas);
        return luas;
    }

    float hitungKeliling(float kel){
        kel = (2*phi)*r*r;
        System.out.println(kel);
        return kel;
    }
}
