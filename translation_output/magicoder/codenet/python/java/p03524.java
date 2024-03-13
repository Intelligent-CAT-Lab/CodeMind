<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
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

@@ Response
```java
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();

        Map<Character, Integer> sFrqDict = new HashMap<>();
        sFrqDict.put('a', 0);
        sFrqDict.put('b', 0);
        sFrqDict.put('c', 0);

        for (char s : S.toCharArray()) {
            sFrqDict.put(s, sFrqDict.get(s) + 1);
        }

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int frq : sFrqDict.values()) {
            if (frq > max) {
                max = frq;
            }
            if (frq < min) {
                min = frq;
            }
        }

        if (max - min <= 1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
```

This Java code does the same thing as the Python code. It reads a string from the user, counts the frequency of each character in the string, and then checks if the difference between the maximum and minimum frequencies is at most 1. If it is, it prints "YES"; otherwise, it prints "NO".<｜end▁of▁sentence｜>
