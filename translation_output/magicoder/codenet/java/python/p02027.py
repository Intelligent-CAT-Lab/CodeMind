<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
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

@@ Response
```python
import math

dp = {}

def search(num, count, max):
    if count == 0:
        return 1
    if num in dp:
        if count in dp[num]:
            return dp[num][count]
    total = 0
    for i in range(2, int(max / (num * math.pow(2, count - 1))) + 1):
        total += search(num * i, count - 1, max)
    if num in dp:
        dp[num][count] = total
    else:
        dp[num] = {count: total}
    return total

def main():
    n, k = map(int, input().split())
    total = 0
    for i in range(1, int(n / math.pow(2, k - 1)) + 1):
        total += search(i, k - 1, n)
    print(total)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It uses a dictionary (`dp`) to store previously calculated values, which can significantly speed up the computation for large inputs. The `search` function is the same as in the Java code, but the `main` function is slightly different because Python does not have a built-in `Scanner` class like Java. Instead, we use the `input()` function to read input from the user, and the `split()` method to split the input into separate values.<｜end▁of▁sentence｜>
