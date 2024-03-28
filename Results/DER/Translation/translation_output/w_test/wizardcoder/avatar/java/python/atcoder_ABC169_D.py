Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
366735600000

Expected output:
10


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
            if (count!= 0)
                res.add(count);
        }
        if (N!= 1) {
            res.add(1);
        }
        return res;
    }
}
```

### Response:
```python
import math

def primeFactor(N):
    res = []
    i = 2
    while i * i <= N:
        count = 0
        while N % i == 0:
            N //= i
            count += 1
        if count!= 0:
            res.append(count)
        i += 1
    if N!= 1:
        res.append(1)
    return res

def countFactors(N):
    factors = primeFactor(N)
    count = 0
    for i in range(len(factors)):
        pow = factors[i]
        increase = 1
        while pow - increase >= 0:
            pow -= increase
            increase += 1
            count += 1
    return count

N = int(input())
print(countFactors(N))
```<|endoftext|>
