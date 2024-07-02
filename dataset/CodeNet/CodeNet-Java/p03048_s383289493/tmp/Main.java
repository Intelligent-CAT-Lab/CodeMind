import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int R = scanner.nextInt();
System.out.println("[INST]6;R;scanner.nextInt();"+R);
    int G = scanner.nextInt();
System.out.println("[INST]7;G;scanner.nextInt();"+G);
    int B = scanner.nextInt();
System.out.println("[INST]8;B;scanner.nextInt();"+B);
    int N = scanner.nextInt();
System.out.println("[INST]9;N;scanner.nextInt();"+N);

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
