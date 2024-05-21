import java.util.*;
public class p02738 {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 int n = sc.nextInt();
 int M = sc.nextInt();
 int l = n * 3 + 1;
 long[][] d = new long[l][n * 5];
 d[0][0] = 1;
 for (int i = 1; i < l; i++) {
 int j = i - 1;
 int k = i - 2;
 d[i][0] = ((d[i - 3][0] * k + roll(d[k], -1)) * j + roll(d[j], 1)) % M;
 }
 long sum = 0;
 for (int i = 0; i < l; i++) {
 sum += d[l - 1][i];
 }
 System.out.println(sum % M);
 }
 public static long roll(long[] arr, int shift) {
 int len = arr.length;
 long[] temp = new long[len];
 for (int i = 0; i < len; i++) {
 temp[(i + shift) % len] = arr[i];
 }
 return temp[0];
 }
}