import java.util.Scanner;

public class Main {
  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    long I = sc.nextInt();
    long O = sc.nextInt();
    long T = sc.nextInt();
    long J = sc.nextInt();
    long L = sc.nextInt();
    long S = sc.nextInt();
    long Z = sc.nextInt();
    long ans = I / 2 * 2 + J / 2 * 2 + L / 2 * 2;
    if (J > 0 && L > 0 & I > 0) {
      ans = Math.max(ans, (I - 1) / 2 * 2 + 3 + (J - 1) / 2 * 2 + (L - 1) / 2 * 2);
    }

    ans += O;
    System.out.println(ans);
  }

}
