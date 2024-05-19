System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```:
```
import java.util.*;

public class atcoder_ABC174_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = 7;
        int res = 1;

        while (num < n) {
            num = num * 10 + 7;
            res++;
        }

        Set<Integer> set = new HashSet<>();

        while (true) {
            if (num % n == 0)
                break;
            num %= n;
            res++;
            if (!set.add(num)) {
                res = -1;
                break;
            }
            num = num * 10 + 7;
        }

        System.out.println(res);
    }
}
```


Answer:
```python
import sys

n = int(input())
num = 7
res = 1

while num < n:
    num = num * 10 + 7
    res += 1

seen = set()

while True:
    if num % n == 0:
        break
    num %= n
    res += 1
    if num in seen:
        res = -1
        break
    seen.add(num)
    num = num * 10 + 7

print(res)
```<|endoftext|>
