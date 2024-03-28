<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class atcoder_ABC169_D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        List<Integer> factors = primeFactor(N);
        int count = 0;
        for (int i = 0; i < factors.size(); i++) {
            int pow = factors.get(i);
            int increase = 1;
            while (pow - increase >= 0) {
                pow -= increase;
                increase++;
                count++;
            }
        }
        System.out.println(count);
    }

    static List<Integer> primeFactor(long N) {
        List<Integer> res = new ArrayList<>();
        for (long i = 2; i * i <= N; i++) {
            int count = 0;
            while (N % i == 0) {
                N /= i;
                count++;
            }
            if (count != 0)
                res.add(count);
        }
        if (N != 1) {
            res.add(1);
        }
        return res;
    }
}
```

@@ Response
```python
import math

def prime_factor(N):
    res = []
    for i in range(2, int(math.sqrt(N)) + 1):
        count = 0
        while N % i == 0:
            N //= i
            count += 1
        if count != 0:
            res.append(count)
    if N != 1:
        res.append(1)
    return res

N = int(input())
factors = prime_factor(N)
count = 0
for i in range(len(factors)):
    pow = factors[i]
    increase = 1
    while pow - increase >= 0:
        pow -= increase
        increase += 1
        count += 1
print(count)
```<｜end▁of▁sentence｜>
