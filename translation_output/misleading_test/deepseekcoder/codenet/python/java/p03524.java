<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
abac

Expected output:
ES

```
# -*- coding: utf-8 -*-
S = input()

s_frq_dict = {'a': 0, 'b': 0, 'c': 0}
for s in S:
    s_frq_dict[s] += 1

frqs = list(s_frq_dict.values())
if max(frqs) - min(frqs) <= 1:
    print('YES')
else:
    print('NO')




```

### Response:
Here is the Java version of the provided Python code:

```java
import java.util.HashMap;
import java.util.Map;
import java.util.Collection;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();

        Map<Character, Integer> s_frq_dict = new HashMap<>();
        s_frq_dict.put('a', 0);
        s_frq_dict.put('b', 0);
        s_frq_dict.put('c', 0);

        for (char s : S.toCharArray()) {
            s_frq_dict.put(s, s_frq_dict.get(s) + 1);
        }

        Collection<Integer> frqs = s_frq_dict.values();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int frq : frqs) {
            if (frq > max) max = frq;
            if (frq < min) min = frq;
        }

        if (max - min <= 1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
```

This Java code does the same thing as the Python code. It counts the frequency of each character in the input string and checks if the difference between the maximum and minimum frequencies is at most 1. If it is, it prints "YES", otherwise it prints "NO".
<|EOT|>
