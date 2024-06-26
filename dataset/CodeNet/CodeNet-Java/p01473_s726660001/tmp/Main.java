import java.io.*;
import java.util.*;
import java.math.*;

public class Main {
  static BigInteger[] facts;

  public static void main(String[] args) throws IOException {
    facts = new BigInteger[27];
    facts[0] = BigInteger.ONE;
    for (int i = 1; i <= 26; i++) {
      facts[i] = facts[i-1].multiply(BigInteger.valueOf(i));
System.out.println("[INST]11;None;facts[i-1].multiply(BigInteger.valueOf(i));"+facts[i-1].multiply(BigInteger.valueOf(i)));
System.out.println("[INST]11;None;BigInteger.valueOf(i);"+BigInteger.valueOf(i));
    }

    char[] s = new BufferedReader(new InputStreamReader(System.in)).readLine().toCharArray();
System.out.println("[INST]14;s;new BufferedReader(new InputStreamReader(System.in)).readLine().toCharArray();"+s);
System.out.println("[INST]14;None;new BufferedReader(new InputStreamReader(System.in)).readLine();"+new BufferedReader(new InputStreamReader(System.in)).readLine());
    int[] a = new int[26];
    for (char c : s) {
      ++a[c-'a'];
    }
    System.out.println(s.length % 2 == 0 ? evenCase(a) : oddCase(a));
  }

  static BigInteger evenCase(int[] a) {
    BigInteger y = BigInteger.ONE;
    int n = 0;
    for (int x : a) {
      if (x % 2 != 0) {
        return BigInteger.ZERO;
      }
      n += x/2;
      y = y.multiply(facts[x/2]);
System.out.println("[INST]30;y;y.multiply(facts[x/2]);"+y);
    }
    return facts[n].divide(y);
System.out.println("[INST]32;None;facts[n].divide(y);"+facts[n].divide(y));
  }

  static BigInteger oddCase(int[] a) {
    for (int i = 0; i < 26; i++) {
      if (a[i] % 2 != 1) {
        continue;
      }
      --a[i];
      return evenCase(a);
    }
    return BigInteger.ZERO;
  }
}