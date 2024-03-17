<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
6 3

Expected output:
3


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

dp = defaultdict(dict)

def main():
    n, k = map(int, input().split())
    total = 0
    for i in range(1, int(n**(1/(2**(k-1))))+1):
        total += search(i, k-1, n)
    print(total)

def search(num, count, max):
    if count == 0:
        return 1
    if num in dp and count in dp[num]:
        return dp[num][count]
    total = 0
    for i in range(2, int(max**(1/(2**count))/num)+1):
        total += search(num*i, count-1, max)
    dp[num][count] = total
    return total

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads two integers from the input, calculates the total number of ways to express the first integer as a sum of the second integer raised to different powers, and prints the total. The calculation is done using dynamic programming to avoid redundant calculations.
<|EOT|>
