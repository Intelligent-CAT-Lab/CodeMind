import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long x = sc.nextLong();
    long y = sc.nextLong();
    long ans1 = 0;
    long ans2 = 0;
    long ans3 = 0;
    long ans4 = 0;
    long x1 = x;
    long x2 = -1 * x;
    long y1 = y;
    long y2 = -1 * y;
    if (x1 <= y1) {
      ans1 = Math.abs(y1 - x1);
    } else {
      ans1 = Long.MAX_VALUE;
    }
    if (x2 <= y1) {
      ans2 = Math.abs(y1 - x2) + 1;
    } else {
      ans2 = Long.MAX_VALUE;
    }
    if (x1 <= y2) {
      ans3 = Math.abs(y2 - x1) + 1;
    } else {
      ans3 = Long.MAX_VALUE;
    }
    if (x2 <= y2) {
      ans4 = Math.abs(y2 - x2) + 2;
    } else {
      ans4 = Long.MAX_VALUE;
    }
    long ans = Math.min(Math.min(ans1, ans2), Math.min(ans3, ans4));
    System.out.println(ans);
  }
}
