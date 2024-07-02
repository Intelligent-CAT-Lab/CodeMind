import java.util.Scanner;
import java.util.Arrays;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
System.out.println("[INST]5;s;sc.next();"+s);
    char[] c = new char[s.length()];
System.out.println("[INST]6;None;s.length();"+s.length());
    c = s.toCharArray();
System.out.println("[INST]7;c;s.toCharArray();"+c);
    Arrays.sort(c);
System.out.println("[INST]8;None;Arrays.sort(c);"+Arrays.sort(c));

    for(int i = 0; i < s.length()-1; i++) {
System.out.println("[INST]10;None;s.length();"+s.length());
      if(c[i] == c[i+1]) {
        System.out.println("no");
        return;
      }
    }
    System.out.println("yes");
  }
}
