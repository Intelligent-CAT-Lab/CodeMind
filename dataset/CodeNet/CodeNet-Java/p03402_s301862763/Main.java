import java.util.*;

class Main{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      int     n    = scan.nextInt();
      int     m    = scan.nextInt();

      char[][] a = new char[100][100];
      for(int i = 0; i < 100; i++){
          for(int j = 0; j < 100; j++){
              if(i < 50){
                 a[i][j] = '#';
                 }
              else{
                  a[i][j] = '.';
                  }
              }
          }
      int u = 0, count = 0;
      while(n - 1 > 0){
            a[count][u] = '.';
            u          += 2;
            n--;
            if(u == 98){
               u      = 0;
               count += 2;
               }
            }
      u = 0;
      while(m - 1 > 0){
            a[99 - count][u] = '#';
            u += 2;
            m--;
            if(u == 98){
               u      = 0;
               count += 2;
               }
            }
      System.out.println("100 100");
      for(int i = 0; i < 100; i++){
          for(int j = 0; j < 100; j++){
              System.out.print(a[i][j]);
              }
          System.out.println();
          }
   }
}
