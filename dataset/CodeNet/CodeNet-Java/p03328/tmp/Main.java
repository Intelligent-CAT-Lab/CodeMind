import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
System.out.println("[INST]5;a;scanner.nextInt();"+a);
    int b = scanner.nextInt();
System.out.println("[INST]6;b;scanner.nextInt();"+b);
    int n = b - a;
    System.out.println(n * (n + 1) / 2 - b);
  }
}
