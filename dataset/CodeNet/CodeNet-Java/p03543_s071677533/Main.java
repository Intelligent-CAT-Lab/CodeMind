import java.util.*;
public class Main{

  public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      String s = sc.next();
      for(int i = 1; i < s.length(); i++) {
        if(s.charAt(i) != s.charAt(i-1))
          break;
        if(i == 2) {
          System.out.println("Yes");
          return;
        }
      }
      for(int i = 2; i < s.length(); i++) {
        if(s.charAt(i) != s.charAt(i-1))
          break;
        if(i == 3) {
          System.out.println("Yes");
          return;
        }
      }
      System.out.println("No");
  }
}

