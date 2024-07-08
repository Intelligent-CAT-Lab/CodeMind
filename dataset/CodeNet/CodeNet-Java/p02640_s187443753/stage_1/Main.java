import java.util.*;
 
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int y = sc.nextInt();
    
    if ( x*2 <= y && x*4 >= y ) {
      if ( y % 2 == 0 ) {
        System.out.println("Yes");
        return;
      }
    } 
    
    System.out.println("No");
  }
}