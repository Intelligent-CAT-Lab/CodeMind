import java.util.Scanner;

public class p02952 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int ans = 0;
    for (int i = 0; i < n; i++) {
      String hoge = String.valueOf(i + 1);
      if (hoge.length() % 2 == 1) {
        ans++;
      }
    }
    System.out.println(ans);
  }
}