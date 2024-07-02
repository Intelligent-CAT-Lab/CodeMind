import java.util.*;
public class Main{

  public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      String s = sc.next();
System.out.println("[INST]5;s;sc.next();"+s);
      for(int i = 1; i < s.length(); i++) {
System.out.println("[INST]6;None;s.length();"+s.length());
        if(s.charAt(i) != s.charAt(i-1))
System.out.println("[INST]7;None;s.charAt(i);"+s.charAt(i));
System.out.println("[INST]7;None;s.charAt(i-1);"+s.charAt(i-1));
          break;
        if(i == 2) {
          System.out.println("Yes");
          return;
        }
      }
      for(int i = 2; i < s.length(); i++) {
System.out.println("[INST]14;None;s.length();"+s.length());
        if(s.charAt(i) != s.charAt(i-1))
System.out.println("[INST]15;None;s.charAt(i);"+s.charAt(i));
System.out.println("[INST]15;None;s.charAt(i-1);"+s.charAt(i-1));
          break;
        if(i == 3) {
          System.out.println("Yes");
          return;
        }
      }
      System.out.println("No");
  }
}

