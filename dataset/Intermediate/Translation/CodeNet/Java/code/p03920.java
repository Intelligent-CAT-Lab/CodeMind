import java.util.Scanner;

public class p03920 {
  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    int N = sc.nextInt();
    while (N > 0) {
      int sum = 0;
      for (int i = 1; ; i++) {
        sum += i;
        if (sum >= N) {
          System.out.println(i);
          N -= i;
          break;
        }
      }
    }
  }

}
