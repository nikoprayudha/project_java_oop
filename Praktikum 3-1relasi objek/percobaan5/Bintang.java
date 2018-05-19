class Bintang {

public static void main(String[] args) {
        Bintang b = new Bintang();
        b.gambarPersegiPenuh();
        System.out.println("");
        b.gambarPersegiKosong();
        System.out.println("");
        b.gambarSegitigaSiku();
        System.out.println("");
        b.gambarSegitigaSikuTerbalik();
        System.out.println("");
        b.gambarSegitigaSikuBolakBalik();
        System.out.println("");
        b.gambarSegitigaSikuCampur(); 
    }

    void gambarPersegiPenuh() {
        System.out.println("Persegi Penuh");
        for (int i = 0; i < 3; i++) {
            System.out.println("");
            for (int j = 0; j < 3; j++) {
                System.out.print("*");
            }
        }
        System.out.println("");
    }

     void gambarPersegiKosong() {
        System.out.println("Persegi Kosong");
        for (int i = 1; i <= 5; i++) {
            System.out.print("*");
            for (int j = 1; j <= 5; j++) {
                if (i==1 || i==5 || i==5) {
                    System.out.print("*");
                }else{
                    System.out.print("");
                }
            }
            System.out.println("");
        }
    }

    void gambarSegitigaSiku() {
        System.out.println("Segitiga Siku");
        for (int i = 0; i <= 5; i++) {
            System.out.println("");
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
        }
        System.out.println("");
    }

    void gambarSegitigaSikuTerbalik() {
        System.out.println("Segitiga Siku Terbalik");
        for (int i = 0; i <= 5; i++) {
            for(int j=4;j>=i;j--){
                System.out.print("*");
            }
            System.out.println("");
        }

    }

     void gambarSegitigaSikuBolakBalik() {
        System.out.println("SegitigaSikuBolakBalik");
        for (int i = 0; i <= 3; i++) {
            System.out.println("");
            for (int j = 0; j < i; j++) {
                  System.out.print("*");
            }
        }
    }

    void gambarSegitigaSikuCampur() {
        System.out.println("Segitiga Siku Campur");
        for (int i = 0; i <= 5; i++) {
            System.out.println("");
            for (int j = 0; j < i; j++) {
              if (i%2==0) {
                System.out.print(i);
                } 
              if (i%2==1) {
                System.out.print("*");
               }
            }
         }
     } 



}
