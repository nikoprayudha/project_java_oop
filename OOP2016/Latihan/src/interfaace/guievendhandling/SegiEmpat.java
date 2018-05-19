package interfaace.guievendhandling;

public class SegiEmpat {
    float p ,l;
    
    public SegiEmpat(float p, float l){
        this.p = p;
        this.l = l;
    }
    public float hitungLuas(){
        return p*l;
    }
    public float hitungKeliling(){
        return 2*(p+l);
    }
}
