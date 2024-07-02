import java.util.*;
 
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
System.out.println("[INST]5;x;sc.nextInt();"+x);
    int y = sc.nextInt();
System.out.println("[INST]6;y;sc.nextInt();"+y);
    
    if ( x*2 <= y && x*4 >= y ) {
      if ( y % 2 == 0 ) {
        System.out.println("Yes");
        return;
      }
    } 
    
    System.out.println("No");
  }
}