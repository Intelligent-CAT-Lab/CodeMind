import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long a = sc.nextLong();
System.out.println("[INST]5;a;sc.nextLong();"+a);
    double b = sc.nextDouble();
System.out.println("[INST]6;b;sc.nextDouble();"+b);
    long bb = (long)((double)100 * b + 0.1);
    long ans = (a * bb) / (long)100;
    System.out.println(ans);
  }
}