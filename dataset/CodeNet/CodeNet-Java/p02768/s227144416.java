import java.util.Scanner;

class Main {
  public static int m = 1000000007;

  public static int pow(int a, int b) {
    long s = 1;
    long a2 = a;
    while (b > 0) {
      if ((b & 1) != 0) {
        s = s * a2 % m;
      }
      a2 = a2 * a2 % m;
      b >>= 1;
    }
    return (int)s;
  }
  public static int reverse(int a) {
    return pow(a, m - 2);
  }

  public static int sub(int n, int a) {
    if (a > n / 2) {
      a = n - a;
    }
    long s1 = 1;
    int n2 = n - a;
    for (int i = n; i > n2; i--) {
      s1 = s1 * i % m;
    }
    long s2 = 1;
    for (int i = 1; i <= a; i++) {
      s2 = s2 * i % m;
    }
    int s3 = reverse((int)s2);
    return (int)(s1 * s3 % m);
  }

  public static void main(String[] args) {
    var sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a = sc.nextInt();
    int b = sc.nextInt();

    long all = pow(2, n);

    long answer = (all + 2 * m - sub(n, a) - sub(n, b) - 1) % m;
    System.out.println(answer);
  }
}