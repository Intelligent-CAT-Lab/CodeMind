import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
System.out.println("[INST]5;S;sc.next();"+S);
    int a = 0, b = 0, c = 0;
    for (int i = 0; i < S.length(); i++) {
System.out.println("[INST]7;None;S.length();"+S.length());
      char x = S.charAt(i);
System.out.println("[INST]8;x;S.charAt(i);"+x);
      if (x == 'a') a++;
      if (x == 'b') b++;
      if (x == 'c') c++;
    }
    if (Math.max(Math.max(a,b),c)-Math.min(Math.min(a,b),c) <= 1) {
System.out.println("[INST]13;None;Math.max(Math.max(a,b),c);"+Math.max(Math.max(a,b),c));
System.out.println("[INST]13;None;Math.max(a,b);"+Math.max(a,b));
System.out.println("[INST]13;None;Math.min(Math.min(a,b),c);"+Math.min(Math.min(a,b),c));
System.out.println("[INST]13;None;Math.min(a,b);"+Math.min(a,b));
      System.out.println("YES");
    } else {
      System.out.println("NO");
    } 
  }
}
