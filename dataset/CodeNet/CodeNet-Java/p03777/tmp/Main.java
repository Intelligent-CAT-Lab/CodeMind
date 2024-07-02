import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String a = sc.next();
System.out.println("[INST]5;a;sc.next();"+a);
    String b = sc.next();
System.out.println("[INST]6;b;sc.next();"+b);
    if(a.equals(b)){
System.out.println("[INST]7;None;a.equals(b);"+a.equals(b));
      System.out.println("H");
    }else{
      System.out.println("D");
    }
  }
}
