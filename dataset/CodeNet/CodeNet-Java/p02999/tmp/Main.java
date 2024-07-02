import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();  // input Integer
System.out.println("[INST]7;a;sc.nextInt();"+a);
    int b = sc.nextInt();  // input Integer
System.out.println("[INST]8;b;sc.nextInt();"+b);
//    String a = sc.next();  // input String
    if (a<b){
      System.out.println(0);
    } else {
      System.out.println(10);
    }
  }
}