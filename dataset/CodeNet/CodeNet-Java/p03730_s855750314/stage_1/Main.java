import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    String ans = "NO";
    if(c % gcd(b, a % b) == 0) ans = "YES";
    System.out.println(ans);
  }

  public static int gcd(int x, int y) {
    if(y == 0) return x;
    return gcd(y, x % y);
  }
}