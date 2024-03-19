<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
6 3

Expected output:
-80

```
import java.util.*;

public class p02027 {
    static HashMap<Integer, HashMap<Integer, Long>> dp = new HashMap<>();
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        long total = 0;
        for (int i = 1; i * Math.pow(2, k - 1) <= n; i++) {
            total += search(i, k - 1, n);
        } 
        System.out.println(total);
    }
    
    static long search(int num, int count, int max) {
        if (count == 0) {
            return 1;
        }
        if (dp.containsKey(num)) {
            if (dp.get(num).containsKey(count)) {
                return dp.get(num).get(count);
            }
        }
        long total = 0;
        for (int i = 2; num * i * Math.pow(2, count - 1) <= max; i++) {
            total += search(num * i, count - 1, max);
        }
        if (dp.containsKey(num)) {
            dp.get(num).put(count, total);
        } else {
            HashMap<Integer, Long> map = new HashMap<>();
            map.put(count, total);
            dp.put(num, map);
        }
        return total;
    }
}

```

### Response:
```python
from collections import defaultdict

dp = defaultdict(lambda: defaultdict(int))

def search(num, count, max_val):
    if count == 0:
        return 1
    if dp[num][count]:
        return dp[num][count]
    total = 0
    i = 2
    while num * i * pow(2, count - 1) <= max_val:
        total += search(num * i, count - 1, max_val)
        i += 1
    dp[num][count] = total
    return total

def main():
    n, k = map(int, input().split())
    total = 0
    i = 1
    while i * pow(2, k - 1) <= n:
        total += search(i, k - 1, n)
        i += 1
    print(total)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads two integers from the input, calculates the total sum of all possible combinations of these integers, and prints the result. The `search` function is used to calculate the number of combinations recursively, and the results are stored in a dictionary for memoization to improve performance.
<|EOT|>
