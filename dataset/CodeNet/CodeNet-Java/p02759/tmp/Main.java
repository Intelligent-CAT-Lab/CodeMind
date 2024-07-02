import java.util.*;

public class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
System.out.println("[INST]5;N;sc.nextInt();"+N);
    System.out.printf("%d", (N + 1) / 2);
System.out.println("[INST]6;None;System.out.printf('%d', (N + 1) / 2);"+System.out.printf("%d", (N + 1) / 2));
    sc.close();
    return;
  }
}