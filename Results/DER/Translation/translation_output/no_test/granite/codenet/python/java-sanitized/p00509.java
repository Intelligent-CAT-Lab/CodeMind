import java.util.*;
public class p00509 {
 static boolean isPrime(int n) {
  if (n <= 1) return false;
  if (n <= 3) return true;
  if (n % 2 == 0 || n % 3 == 0) return false;
  for (int i = 5; i * i <= n; i = i + 6)
   if (n % i == 0 || n % (i + 2) == 0)
    return false;
  return true;
 }
 static int f() {
  Scanner sc = new Scanner(System.in);
  int n = sc.nextInt(), c = sc.nextInt();
  String s = "9";
  if (c < 0) return 11;
  for (char h : "9731".toCharArray()) {
   if (n > 1) {
    for (int m = (int) Math.pow(10, n - 2); m > 0; m--) {
     String m_str = String.valueOf(m - 1);
     if (((h - '0') + (m_str.charAt(m_str.length() - 1) - '0') * 2 + c) % 3!= 0) {
      String t = String.valueOf(h) + m_str.substring(0, n - 2);
      int a = Integer.parseInt(t + c + new StringBuilder(t).reverse().toString());
      if (isPrime(a)) return a;
     }
    }
   } else {
    int a = Integer.parseInt(String.valueOf(h) + c + h);
    if (isPrime(a)) return a;
   }
  }
  return 0;
 }
 public static void main(String[] args) {
  System.out.println(f());
 }
}