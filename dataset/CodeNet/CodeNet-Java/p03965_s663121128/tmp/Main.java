import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
System.out.println("[INST]5;s;sc.next();"+s);
    int v = 0;
    int a = 0;
    int b = 0;
    int c = 0;
    for(int i = 0; i < s.length(); i++) {
System.out.println("[INST]10;None;s.length();"+s.length());
      if(s.charAt(i) == 'g') {
System.out.println("[INST]11;None;s.charAt(i);"+s.charAt(i));
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