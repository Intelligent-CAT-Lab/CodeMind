import java.util.Scanner;

public class Main {
  public static void main (String[] args) {
    Scanner in = new Scanner(System.in);

    while (in.hasNext()) {
System.out.println("[INST]6;None;in.hasNext();"+in.hasNext());
      int N = in.nextInt();
System.out.println("[INST]7;N;in.nextInt();"+N);
      int ans = 0;

      if (N >= 10) {
        ans += 9;
      } else {
        ans += N;
      }

      if (N >= 1000) {
        ans += 900; // 100 ~ 999
      } else if (N >= 100) {
        ans += N - 100 + 1;
      }

      if (N >= 100000) {
        ans += 90000; // 10000 ~ 99999
      } else if (N >= 10000) {
        ans += N - 10000 + 1;
      }

      System.out.println(ans);
    }
  }
}