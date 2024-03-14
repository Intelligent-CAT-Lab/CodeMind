<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
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

def main():
    n, k = map(int, input().split())
    total = 0
    for i in range(1, int(n**(1/(k-1)))+1):
        total += search(i, k-1, n)
    print(total)

def search(num, count, max):
    if count == 0:
        return 1
    if dp[num][count]:
        return dp[num][count]
    total = 0
    for i in range(2, int(max**(1/(count-1)))//num+1):
        total += search(num*i, count-1, max)
    dp[num][count] = total
    return total

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It uses a defaultdict to store previously computed values, which is a more Pythonic way of handling this situation. The main difference is that Python uses the `input().split()` function to read multiple inputs from the user, and the `map()` function to convert these inputs to integers. The `//` operator is used for integer division in Python. The `**` operator is used for exponentiation. The `range()` function in Python is equivalent to the `for` loop in Java. The `if __name__ == "__main__":` line is used to call the `main()` function when the script is run directly, but not when it is imported as a module.
<|EOT|>
