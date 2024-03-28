<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
from collections import Counter

MOD = 10**9 + 7
N = int(input())
count = Counter()
ans = 1
num = []

for i in range(2, N+1):
    
    for n in num:
        while not i % n:
            count[n] += 1
            i //= n
        if i == 1:
            break
    else:
        num.append(i)
        count[i] = 1
        
for n in count.values():
    ans = ans * (n+1) % MOD
print(ans)
```

### Response:
```java
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final long MOD = (long) Math.pow(10, 9) + 7;
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        HashMap<Integer, Long> count = new HashMap<>();
        long ans = 1;
        ArrayList<Integer> num = new ArrayList<>();

        for (int i = 2; i <= N; i++) {
            for (int n : num) {
                while (i % n == 0) {
                    count.put(n, count.getOrDefault(n, 0L) + 1);
                    i /= n;
                }
                if (i == 1) {
                    break;
                }
            }
            if (!num.contains(i)) {
                num.add(i);
                count.put(i, 1L);
            }
        }

        for (long n : count.values()) {
            ans = (ans * (n+1)) % MOD;
        }
        System.out.println(ans);
    }
}
```

This Java code does the same thing as the Python code. It counts the number of each prime number up to N and then calculates the product of (count[prime] + 1) modulo 10^9 + 7. The prime numbers are stored in an ArrayList `num` and their counts are stored in a HashMap `count`.
<|EOT|>
