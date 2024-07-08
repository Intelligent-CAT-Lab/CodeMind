import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    int a = 0, b = 0, c = 0;
var newVariable_0 = S.length();    for (int i = 0; i < newVariable_0; i++) {
      char x = S.charAt(i);
      if (x == 'a') a++;
      if (x == 'b') b++;
      if (x == 'c') c++;
    }
var newVariable_1 = Math.max(Math.max(a,b),c);var newVariable_2 = Math.max(a,b);var newVariable_3 = Math.min(Math.min(a,b),c);var newVariable_4 = Math.min(a,b);    if (Math.max(Math.max(a,b),c)-Math.min(newVariable_4,c) <= 1) {
      System.out.println("YES");
    } else {
      System.out.println("NO");
    } 
  }
}
