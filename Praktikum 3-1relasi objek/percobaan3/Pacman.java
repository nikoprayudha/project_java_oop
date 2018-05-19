class Pacman {

    int x;
    int y;

    public static void main(String[] args) {
        Pacman pekmen = new Pacman();
        pekmen.x = 30;
        pekmen.y = 20;
        pekmen.kanan();
        pekmen.kiri();
        pekmen.atas();
        pekmen.bawah();
        pekmen.tampilPosisi();
    }

    void kanan() {
        x = x + 5;
        if (x > 50) {
            System.out.println("X Tidak Boleh Lebih dari 50 :(");
        } else {
            System.out.println("Kanan :" + x);
        }
    }

    void kiri() {
        x = x - 5;
        if (x < 0) {
            System.out.println("Y Tidak Boleh Kurang dari 0 :(");
        } else {
            System.out.println("Kiri :" + y);
        }
    }

    void atas() {
        y = y - 3;
        if (y < 0) {
            System.out.println("Y Tidak Boleh kurang dari 0 :(");
        } else {
            System.out.println("Kiri :" + y);
        }

    }

    void bawah() {
        y = y + 3;
        if (y > 25) {
            System.out.println("Y Tidak Boleh lebih dari 25 :(");
        } else {
            System.out.println("Kiri :" + y);
        }
    }

    void tampilPosisi() {
        System.out.println("X =" + x);
        System.out.println("Y =" + y);
    }
}
