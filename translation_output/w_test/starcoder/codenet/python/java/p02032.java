<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
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
    
        return [prime for prime in prime_list if prime!= 0]
    
    
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
            if num!= 1:
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

java code:<fim_suffix><fim_middle>

```java
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    public void run() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n + 1];
        for (int i = 2; i <= n; i++) {
            arr[i] = i;
        }
        for (int i = 2; i <= n; i++) {
            if (arr[i]!= i) {
                continue;
            }
            for (int j = i; j <= n; j += i) {
                arr[j] = arr[j] / i * (i - 1);
            }
        }
        int ans = 0;
        for (int i = 2; i <= n; i++) {
            ans += arr[i];
        }
        System.out.println(ans);
    }
}

```

'''
<|endoftext|>
