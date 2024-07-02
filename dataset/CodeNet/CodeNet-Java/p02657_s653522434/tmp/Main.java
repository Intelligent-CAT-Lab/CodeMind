import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
System.out.println("[INST]6;a;sc.nextInt();"+a);
    int b = sc.nextInt();
System.out.println("[INST]7;b;sc.nextInt();"+b);

    System.out.println(a * b);

  }

}