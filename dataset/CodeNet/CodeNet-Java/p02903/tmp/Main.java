import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int h = Integer.parseInt(sc.next());
System.out.println("[INST]5;h;Integer.parseInt(sc.next());"+h);
System.out.println("[INST]5;None;sc.next();"+sc.next());
    int w = Integer.parseInt(sc.next());
System.out.println("[INST]6;w;Integer.parseInt(sc.next());"+w);
System.out.println("[INST]6;None;sc.next();"+sc.next());
    int a = Integer.parseInt(sc.next());
System.out.println("[INST]7;a;Integer.parseInt(sc.next());"+a);
System.out.println("[INST]7;None;sc.next();"+sc.next());
    int b = Integer.parseInt(sc.next());
System.out.println("[INST]8;b;Integer.parseInt(sc.next());"+b);
System.out.println("[INST]8;None;sc.next();"+sc.next());
    //int c[][] = new int[h][w];
    String s1 = "";
    String s2 = "";
    
    for(int j=0; j<w; j++){
      if (j<a) {
        s1 = s1 + "0";
        s2 = s2 + "1";
      } else {
        s1 = s1 + "1";
        s2 = s2 + "0";
      }
    }
    
    for(int i=0; i<h; i++){
        if(i<b) {
          System.out.print(s1);
        } else if (i>=b) {
          System.out.print(s2);
        }
        System.out.print("\n");
    }
    
//    for(int i=0; i<h; i++){
//      for(int j=0; j<w; j++){
//        System.out.print(c[i][j]);
//      }
//      System.out.print("\n");
//    }
    
  }
}
