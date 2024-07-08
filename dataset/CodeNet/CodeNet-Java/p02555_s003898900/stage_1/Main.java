import java.math.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
  static BigInteger MOD = new BigInteger("1000000007");

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int s = sc.nextInt();
    System.out.println(culc(s));
  }

  static Map<Integer, BigInteger> MAP = new HashMap<>();
  static BigInteger culc(int n) {
    return MAP.computeIfAbsent(n, key -> {
      if (n <= 2) {
        return BigInteger.ZERO;
      }
      BigInteger result = BigInteger.ONE;
      for (int i = 3, len = n - 3; i <= len; i++) {
        result = result.add(culc(n - i)).remainder(MOD);
      }
      return result;
    });
  }
}
