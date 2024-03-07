<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java Code:

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

Translate the above java code to python.

python Code:

[/INST]
```python
import sys

n = int(input())
num = 7
res = 1

while num < n:
    num = num * 10 + 7
    res += 1

set = set()

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
This is the Python code equivalent to the given Java code. The main difference is that Python uses indentation to denote code blocks, whereas Java uses curly braces. Additionally, Python has a built-in `set` data structure, which is used in the Python code to keep track of the numbers that have been seen so far.</s>
