import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    final String S = sc.next();
System.out.println("[INST]5;S;sc.next();"+S);
    final String T = sc.next();
System.out.println("[INST]6;T;sc.next();"+T);
    sc.close();
    System.out.println(T+S);
  }
}