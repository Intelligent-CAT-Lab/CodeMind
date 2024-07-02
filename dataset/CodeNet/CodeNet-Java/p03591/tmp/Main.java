import java.util.*;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String s = sc.next();
System.out.println("[INST]7;s;sc.next();"+s);
    if(s.length() < 4) {
System.out.println("[INST]8;None;s.length();"+s.length());
      System.out.println("No");
      return;
    }
    String s2 = s.substring(0, 4);
System.out.println("[INST]12;s2;s.substring(0, 4);"+s2);
    if(s2.equals( "YAKI"))System.out.println("Yes");
System.out.println("[INST]13;None;s2.equals( 'YAKI');"+s2.equals( "YAKI"));
    else System.out.println("No");

  }
}
