import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int R = scanner.nextInt();
    int G = scanner.nextInt();
    int B = scanner.nextInt();
    int N = scanner.nextInt();

    long count = 0;
    for (int i = 0; i <= N / R; i++) {
      int r = N - R * i;
      for (int j = 0; j <= r / G; j++) {
        if ((r - G * j) % B == 0) count++;
      }
    }
    System.out.println(count);
  }
}
