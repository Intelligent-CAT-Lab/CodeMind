<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3

Expected output:
4


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
```
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
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
This is a Java implementation of the Python code. It uses a `HashMap` to store the count of each number and a `for` loop to iterate over the numbers from 2 to N. For each number, it checks if it is already in the `HashMap` and if it is, it increments the count. If it is not, it adds it to the `HashMap` with a count of 1.

After the loop, it iterates over the `HashMap` and calculates the final answer by multiplying the count of each number by (n + 1) and taking the modulo of the result with MOD.

Note that the `getOrDefault` method is used to get the count of a number from the `HashMap`, and if it is not present, it returns 0.</s>
