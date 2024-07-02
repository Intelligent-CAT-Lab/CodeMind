import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
System.out.println("[INST]4;a;sc.nextInt();"+a);
    int b = sc.nextInt();
System.out.println("[INST]5;b;sc.nextInt();"+b);
    int c = sc.nextInt();
System.out.println("[INST]6;c;sc.nextInt();"+c);
    if(c >= a && c <= b){
      System.out.println("Yes");
    }
    else
      System.out.println("No");
  }
}
