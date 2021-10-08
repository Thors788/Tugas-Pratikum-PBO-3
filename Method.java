public class Method {
    // bagian ide/ algoritma
    
    /* Method untuk menambahkan pecahan 1 dan pecahan 2 */
    static void sumFraction(int e1, int d1, int e2, int d2)
    {
      int es = e1 * d2 + e2 * d1, ds = d1 * d2;
      int pmbagi = FPB(es, ds);
      es = es / pmbagi;
      ds = ds / pmbagi;
      printFraction(es, ds);
    }
  
    /* Method yang digunakan untuk mengalikan antara pecahan 1 dengan pecahan 2*/
    static void productFraction(int e1, int d1, int e2, int d2)
    {
      int ep = e1 * e2, dp = d1 * d2;
      int pmbagi = FPB(ep, dp);
      ep = ep / pmbagi;
      dp = dp / pmbagi;
      printFraction(ep, dp);
    }
  
    /* Method yang digunakan untuk mencetak pecahan ke terminal */
    static void printFraction(int e, int d)
    {
      System.out.println(e + " / " + d); 
    }
  
    /* Method yang digunakan untuk mencari FPB pembilang dan penyebut */
    static int FPB(int e, int d)
    {
      int FPB = 1;
      for (int i = 1; i <= e && i <= d; i++) {
        if (e % i == 0 && d % i == 0)
        FPB = i;
      }
      return FPB;
    }
  
    public static void main(String[] args)
    {
      // method utama untuk melakukan testcase 
      sumFraction(1, 2, 2, 3);
      sumFraction(1, 3, 3, 4);
      productFraction(1, 2, 2, 3);
      productFraction(1, 4, 2, 3);
    }
  }
