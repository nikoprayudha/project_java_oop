class Statistik {
    int dataArr[] = {20,50,3,4,1,23,16,45,32,22,1};

    public static void main(String[] args) {
        Statistik dragneel = new Statistik();
        dragneel.tampilData();
        dragneel.sum();
        dragneel.average();
        dragneel.max();
        dragneel.min();
    }

    void tampilData(){
      System.out.println("Data Array :");
        for (int i=0;i < dataArr.length ;i++ ) {
            System.out.print(" " +dataArr[i]);
        }
    }

    int sum(){
      int sum = 0;
      System.out.println("");
      System.out.println("Sum Data Array :");
      for (int i=0;i < dataArr.length ;i++ ) {
        sum = sum + dataArr[i];
      }
      System.out.println(sum);
      return sum;
    }
    float average(){
      System.out.println("");
      System.out.println("Avg Data Array :");
      int sum =0;
        for (int i=0;i < dataArr.length ;i++ ) {
          sum = sum + dataArr[i];
        }
      float avg  = sum / dataArr.length;
      System.out.println(avg);
      return avg;
    }

    int max(){
      System.out.println("");
      System.out.println("Max Data Array :");
      int getMax = 0;
      for (int i=1;i < dataArr.length ;i++ ) {
        if (dataArr[i] > getMax) {
          getMax = dataArr[i];
          System.out.println(getMax);
        }
      }
      return getMax;
    }

    int min(){
      System.out.println("");
      System.out.println("Min Data Array :");
      int getMin = 0;
      for (int i=1;i < dataArr.length ;i++ ) {
        if (dataArr[i] < getMin) {
          getMin = dataArr[i];
          System.out.println(getMin);
        }
      }
      return getMin;
    }


    int cariNilaiTengah(){
      return 0;
    }

}
