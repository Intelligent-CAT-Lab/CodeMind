import java.util.*;
import java.math.*;

public class p01863 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    int length = s.length();
    int BASE = 100;
    int MOD1 = 1000000007;
    int MOD2 = 2147483647;
    long acc1 = 0;
    long acc2 = 0;
    List<Long> hlst1 = new ArrayList<Long>();
    List<Long> hlst2 = new ArrayList<Long>();
    for (int i = 0; i < length; i++) {
      char c = s.charAt(i);
      acc1 = (acc1 * BASE + (int)c) % MOD1;
      acc2 = (acc2 * BASE + (int)c) % MOD2;
      hlst