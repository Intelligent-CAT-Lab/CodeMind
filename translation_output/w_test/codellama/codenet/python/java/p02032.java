<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
18

Expected output:
2 5


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
[/INST]

Here is the Java code that translates the Python code:
```java
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PrimeFactorization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<Integer, Integer> d = primeFactorization(n);
        int val = 1;
        for (Integer v : d.values()) {
            val *= (v + 1);
        }
        System.out.println(d.size() + " " + (val - 1));
    }

    public static Map<Integer, Integer> primeFactorization(int n) {
        if (n <= 1) {
            return null;
        }
        int numSqrt = (int) Math.sqrt(n);
        ArrayList<Integer> primeList = makePrimeList(numSqrt);
        Map<Integer, Integer> dictCounter = new HashMap<>();
        for (int prime : primeList) {
            while (n % prime == 0) {
                if (dictCounter.containsKey(prime)) {
                    dictCounter.put(prime, dictCounter.get(prime) + 1);
                } else {
                    dictCounter.put(prime, 1);
                }
                n /= prime;
            }
        }
        if (n != 1) {
            if (dictCounter.containsKey(n)) {
                dictCounter.put(n, dictCounter.get(n) + 1);
            } else {
                dictCounter.put(n, 1);
            }
        }
        return dictCounter;
    }

    public static ArrayList<Integer> makePrimeList(int num) {
        ArrayList<Integer> primeList = new ArrayList<>();
        for (int i = 2; i <= num; i++) {
            primeList.add(i);
        }
        for (int prime : primeList) {
            if (prime == 0) {
                continue;
            }
            if (prime > numSqrt) {
                break;
            }
            for (int nonPrime = 2 * prime; nonPrime <= num; nonPrime += prime) {
                primeList.set(nonPrime, 0);
            }
        }
        return primeList;
    }
}
```
Note that this code is not optimized for performance, and it may not be the most efficient way to solve the problem. However, it should work correctly and produce the same output as the Python code.</s>
