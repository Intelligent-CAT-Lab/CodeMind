import java.util.Scanner;
public class Main {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();
  int m = sc.nextInt();
  long[] x = new long[100001];
  int a = 1000000007;
  if (Math.abs(n - m) > 1) {
    System.out.println('0');
    return;
  }
  x[0] = 1;
  for(int i = 1; i <= 100000; i++)x[i] = x[i - 1] * i % a;
  long ans = x[n] * x[m] % a;
  if(n == m) ans = ans * 2 % a;
  System.out.println(ans);
  return;
}}
