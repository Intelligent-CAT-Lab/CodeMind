import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int v = 0;
    int a = 0;
    int b = 0;
    int c = 0;
    for(int i = 0; i < s.length(); i++) {
      if(s.charAt(i) == 'g') {
        if(v == 0) {
          v++;
          b++;
        } else {
          v--;
          a++;
        }
      } else {
        if(v == 0) {
          v++;
          c++;
        } else {
          v--;
          b++;
        }
      }
    }
    System.out.println(a - c);
  }
}