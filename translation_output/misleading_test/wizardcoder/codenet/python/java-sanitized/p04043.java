import java.util.*;

public class p04043 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    if (Arrays.equals(new int[]{a, b, c}, new int[]{5, 5, 7})) {
      System.out.println("NEO");
    } else {
      System.out.println("NO");
    }
  }
}