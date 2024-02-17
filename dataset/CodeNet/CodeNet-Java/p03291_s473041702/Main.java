import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    long N = 1_000_000_007L;
    Scanner scanner = new Scanner(System.in);
    String str = scanner.next();

    long[][] d = new long[str.length() + 1][4];
    d[0][0] = 1;
    for (int i = 1; i <= str.length(); i++) {
      char ch = str.charAt(i - 1);

      int n = ch == '?' ? 3 : 1;
      int a = 0, b = 0, c = 0;
      if (ch == 'A' || ch == '?') a = 1;
      if (ch == 'B' || ch == '?') b = 1;
      if (ch == 'C' || ch == '?') c = 1;
      d[i][0] = d[i - 1][0] * n % N;
      d[i][1] = d[i - 1][1] * n % N + a * d[i - 1][0];
      d[i][2] = d[i - 1][2] * n % N + b * d[i - 1][1];
      d[i][3] = d[i - 1][3] * n % N + c * d[i - 1][2];

      for (int j = 0; j < 4; j++) d[i][j] %= N;
    }

    System.out.println(d[str.length()][3]);
  }
}
