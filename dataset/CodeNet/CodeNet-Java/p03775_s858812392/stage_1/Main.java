import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long N = sc.nextLong();
    double rootN = Math.sqrt((double)N);
    int min = Integer.MAX_VALUE;
    for (int i = 1; i <= rootN; i++) {
      if (N % i != 0) {
        continue;
      }
      int tmp = Math.max(digitCount(i), digitCount(N / i));
      if (tmp < min) {
        min = tmp;
      }
    }
    System.out.println(min);
  }

  public static int digitCount(long n) {
    int count = 0;
    while (n > 0) {
      count++;
      n /= 10;
    }
    return count;
  }
}