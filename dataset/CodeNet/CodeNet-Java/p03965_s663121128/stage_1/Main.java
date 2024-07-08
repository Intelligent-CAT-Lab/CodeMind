import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int v = 0;
    int a = 0;
    int b = 0;
    int c = 0;
var newVariable_0 = s.length();    for(int i = 0; i < newVariable_0; i++) {
var newVariable_1 = s.charAt(i);      if(newVariable_1 == 'g') {
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