import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int sum = a + b + c;
    int discr = (2 * a - sum) * (2 * b - sum) * (2 * c - sum);
    if (discr == 0) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}
