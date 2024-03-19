<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3

Expected output:
77

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
[/INST]
```java
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int MOD = 1000000007;
        int ans = 1;
        Map<Integer, Integer> count = new HashMap<>();
        int[] num = new int[N];

        for (int i = 2; i <= N; i++) {
            for (int n : num) {
                while (i % n == 0) {
                    count.put(n, count.getOrDefault(n, 0) + 1);
                    i /= n;
                }
                if (i == 1) {
                    break;
                }
            }
            if (i > 1) {
                num[num.length] = i;
                count.put(i, 1);
            }
        }

        for (int n : count.values()) {
            ans = (ans * (n + 1)) % MOD;
        }

        System.out.println(ans);
    }
}
```
This code uses a similar approach as the Python code, but it is written in Java. It uses a `HashMap` to store the count of each number, and it uses a `for` loop to iterate over the numbers from 2 to N. For each number, it checks if it is already in the `HashMap`, and if it is not, it adds it to the `HashMap` with a count of 1. If the number is already in the `HashMap`, it increments the count by 1.

After the loop is finished, the code iterates over the values in the `HashMap` and multiplies them together to get the final answer. The answer is then printed to the console.

Note that the code uses the `getOrDefault` method of the `HashMap` class to get the count of a number, and it uses the `put` method to add a new number to the `HashMap` with a count of 1. These methods are used instead of the `get` and `put` methods of the `HashMap` class because they allow the code to specify a default value for the count if the number is not already in the `HashMap`.</s>
