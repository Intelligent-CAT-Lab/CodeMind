import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int a = scan.nextInt();
System.out.println("[INST]5;a;scan.nextInt();"+a);
    int b = scan.nextInt();
System.out.println("[INST]6;b;scan.nextInt();"+b);
    int c = scan.nextInt();
System.out.println("[INST]7;c;scan.nextInt();"+c);
    int d = scan.nextInt();
System.out.println("[INST]8;d;scan.nextInt();"+d);
    int sum = 0;
    if (d<=a){
      System.out.println(d);
      return;
    }
    sum = a;
    d -= a;
    if(d<=b){
      System.out.println(sum);
      return;
    }
    d-=b;
    sum -= d;
    System.out.println(sum);
  }
}
