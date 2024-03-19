<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
260522

Expected output:
18

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

python code:<fim_suffix><fim_middle>

```python
import sys

n = int(sys.stdin.readline())
num = 7
res = 1

while num < n:
    num = num * 10 + 7
    res += 1

while True:
    if num % n == 0:
        break
    num %= n
    res += 1
    if num in set:
        res = -1
        break
    set.add(num)
    num = num * 10 + 7

print(res)
```
"""
<|endoftext|>
