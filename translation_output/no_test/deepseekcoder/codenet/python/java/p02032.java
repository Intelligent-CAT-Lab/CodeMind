<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
import sys
sys.setrecursionlimit(10 ** 5 + 10)
def input(): return sys.stdin.readline().strip()

def resolve():
    n=int(input())
    import math
    
    
    # cf. https://qiita.com/suecharo/items/14137fb74c26e2388f1f
    def make_prime_list_2(num):
        if num < 2:
            return []
    
        # 0ã®ãã®ã¯ç´ æ°ãããªãã¨ãã
        prime_list = [i for i in range(num + 1)]
        prime_list[1] = 0  # 1ã¯ç´ æ°ã§ã¯ãªã
        num_sqrt = math.sqrt(num)
    
        for prime in prime_list:
            if prime == 0:
                continue
            if prime > num_sqrt:
                break
    
            for non_prime in range(2 * prime, num, prime):
                prime_list[non_prime] = 0
    
        return [prime for prime in prime_list if prime != 0]
    
    
    def prime_factorization_2(num):
        """numã®ç´ å æ°åè§£
        ç´ å æ°ãkeyã«ä¹æ°ãvalueã«æ ¼ç´ããè¾æ¸ådict_counterãè¿ã"""
    
        if num <= 1:
            # ä¾ãã°1ãé£ã£ãã¨ãã®å¯¾å¦ã®ä»æ¹ã¯åé¡ã«ãã£ã¦éãã¨æãã®ã§ãã®ã¤ã©èããã
            # cf. https://atcoder.jp/contests/abc110/submissions/12688244
            return False
        else:
            num_sqrt = math.floor(math.sqrt(num))
            prime_list = make_prime_list_2(num_sqrt)
    
            dict_counter = {}  # ä½åº¦ããã®é¢æ°ãå¼ã³åºãã¦è¾æ¸ãæ´æ°ãããæã¯ãããå¼æ°ã«ãã¦
            # cf. https://atcoder.jp/contests/arc034/submissions/12251452
    
            for prime in prime_list:
                while num % prime == 0:
                    if prime in dict_counter:
                        dict_counter[prime] += 1
                    else:
                        dict_counter[prime] = 1
                    num //= prime
            if num != 1:
                if num in dict_counter:
                    dict_counter[num] += 1
                else:
                    dict_counter[num] = 1
    
            return dict_counter
    d=prime_factorization_2(n)
    val=1
    for v in d.values():
        val*=(v+1)
    print(len(d),val-1)

    
resolve()

```

### Response:
```java
import java.util.*;
import java.math.*;

public class Main {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int n = in.nextInt();
        Map<BigInteger, BigInteger> primeFactors = primeFactorization(BigInteger.valueOf(n));
        BigInteger total = BigInteger.ONE;
        for (BigInteger power : primeFactors.values()) {
            total = total.multiply(power.add(BigInteger.ONE));
        }
        System.out.println(primeFactors.size() + " " + (total.subtract(BigInteger.ONE)));
    }

    static List<BigInteger> primes = new ArrayList<>();

    static Map<BigInteger, BigInteger> primeFactorization(BigInteger n) {
        Map<BigInteger, BigInteger> factors = new HashMap<>();
        if (n.compareTo(BigInteger.ONE) <= 0) {
            return factors;
        }
        BigInteger num = n;
        for (BigInteger p : primes) {
            if (p.compareTo(n.sqrt()) > 0) {
                break;
            }
            while (num.mod(p).compareTo(BigInteger.ZERO) == 0) {
                factors.put(p, factors.getOrDefault(p, BigInteger.ZERO).add(BigInteger.ONE));
                num = num.divide(p);
            }
        }
        if (num.compareTo(BigInteger.ONE) > 0) {
            factors.put(num, BigInteger.ONE);
        }
        return factors;
    }

    static void makePrimeList(int num) {
        if (num < 2) {
            return;
        }
        List<BigInteger> primeList = new ArrayList<>(Collections.nCopies(num + 1, BigInteger.ONE));
        for (int i = 2; i <= num; i++) {
            if (primeList.get(i).compareTo(BigInteger.ONE) == 0) {
                primeList.set(i, BigInteger.valueOf(i));
                for (int j = 2 * i; j <= num; j += i) {
                    primeList.set(j, BigInteger.ZERO);
                }
            }
        }
        primes.addAll(primeList.stream().filter(p -> p.compareTo(BigInteger.ONE) > 0).toList());
    }

    static {
        makePrimeList((int) Math.sqrt(Integer.MAX_VALUE));
    }
}
```

This Java code does the same thing as the Python code. It calculates the prime factorization of a number and prints the number of distinct prime factors and the product of (count of prime factor + 1). The prime factorization is calculated using the Sieve of Eratosthenes algorithm. The prime factors are stored in a HashMap where the key is the prime factor and the value is the count of that prime factor. The HashMap is used because it allows for constant time complexity for the get and put operations. The size of the HashMap is the number of distinct prime factors. The product of (count of prime factor + 1) is calculated by multiplying all the values in the HashMap. The product is subtracted by 1 to exclude the number 1 from the count.
<|EOT|>
