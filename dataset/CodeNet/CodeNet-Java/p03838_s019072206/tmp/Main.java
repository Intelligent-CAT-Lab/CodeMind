import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long x = sc.nextLong();
System.out.println("[INST]5;x;sc.nextLong();"+x);
    long y = sc.nextLong();
System.out.println("[INST]6;y;sc.nextLong();"+y);
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
System.out.println("[INST]16;ans1;Math.abs(y1 - x1);"+ans1);
    } else {
      ans1 = Long.MAX_VALUE;
    }
    if (x2 <= y1) {
      ans2 = Math.abs(y1 - x2) + 1;
System.out.println("[INST]21;None;Math.abs(y1 - x2);"+Math.abs(y1 - x2));
    } else {
      ans2 = Long.MAX_VALUE;
    }
    if (x1 <= y2) {
      ans3 = Math.abs(y2 - x1) + 1;
System.out.println("[INST]26;None;Math.abs(y2 - x1);"+Math.abs(y2 - x1));
    } else {
      ans3 = Long.MAX_VALUE;
    }
    if (x2 <= y2) {
      ans4 = Math.abs(y2 - x2) + 2;
System.out.println("[INST]31;None;Math.abs(y2 - x2);"+Math.abs(y2 - x2));
    } else {
      ans4 = Long.MAX_VALUE;
    }
    long ans = Math.min(Math.min(ans1, ans2), Math.min(ans3, ans4));
System.out.println("[INST]35;ans;Math.min(Math.min(ans1, ans2), Math.min(ans3, ans4));"+ans);
System.out.println("[INST]35;None;Math.min(ans1, ans2);"+Math.min(ans1, ans2));
System.out.println("[INST]35;None;Math.min(ans3, ans4);"+Math.min(ans3, ans4));
    System.out.println(ans);
  }
}
