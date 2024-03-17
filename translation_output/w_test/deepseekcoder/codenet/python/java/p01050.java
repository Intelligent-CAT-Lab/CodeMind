<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
0ig3he12fz99

Expected output:
9


```
#!/usr/bin/env python3
# -*- coding: utf-8 -*-
#C
s = list(input())
abc = list("-abcdefghijklmnopqrstuvwxyz-")
num = list("-0123456789-")
abc_cnt = [0]*28
num_cnt = [0]*12

for i in range(len(s)):
    for j in range(1,27):
        if s[i] == abc[j]:
            abc_cnt[j] += 1

for i in range(len(s)):
    for j in range(1,11):
        if s[i] == num[j]:
            num_cnt[j] += 1
ans = 0
abc_sum = sum(abc_cnt)
num_sum = sum(num_cnt)


while abc_sum > 0:
    start = 100
    current = 1
    while current < 27:
        if abc_cnt[current-1] == 0 and abc_cnt[current] > 0:
            start = min(start,current)

        if abc_cnt[current+1] == 0 and abc_cnt[current] > 0:
            ans += min(3, current - start + 1)
            abc_cnt[current] -= 1
            abc_sum -= 1
            break

        if abc_cnt[current] > 0:
            abc_cnt[current] -= 1
            abc_sum -= 1

        current += 1

while num_sum > 0:
    start = 100
    current = 1
    while current < 11:
        if num_cnt[current-1] == 0 and num_cnt[current] > 0:
            start = min(start,current)

        if num_cnt[current+1] == 0 and num_cnt[current] > 0:
            ans += min(3, current - start + 1)
            num_cnt[current] -= 1
            num_sum -= 1
            break

        if num_cnt[current] > 0:
            num_cnt[current] -= 1
            num_sum -= 1

        current += 1


print(ans)
```

### Response:
Here is the Java version of your Python code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int[] abc_cnt = new int[28];
        int[] num_cnt = new int[12];
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isAlphabetic(c)) {
                abc_cnt[c - 'a' + 1]++;
            } else if (Character.isDigit(c)) {
                num_cnt[c - '0' + 1]++;
            }
        }
        int ans = 0;
        int abc_sum = Arrays.stream(abc_cnt).sum();
        int num_sum = Arrays.stream(num_cnt).sum();
        while (abc_sum > 0) {
            int start = 100;
            for (int current = 1; current < 27; current++) {
                if (abc_cnt[current] > 0) {
                    if (abc_cnt[current - 1] == 0) {
                        start = Math.min(start, current);
                    }
                    if (abc_cnt[current + 1] == 0) {
                        ans += Math.min(3, current - start + 1);
                        abc_cnt[current]--;
                        abc_sum--;
                        break;
                    }
                    abc_cnt[current]--;
                    abc_sum--;
                }
            }
        }
        while (num_sum > 0) {
            int start = 100;
            for (int current = 1; current < 11; current++) {
                if (num_cnt[current] > 0) {
                    if (num_cnt[current - 1] == 0) {
                        start = Math.min(start, current);
                    }
                    if (num_cnt[current + 1] == 0) {
                        ans += Math.min(3, current - start + 1);
                        num_cnt[current]--;
                        num_sum--;
                        break;
                    }
                    num_cnt[current]--;
                    num_sum--;
                }
            }
        }
        System.out.println(ans);
    }
}
```

This Java code does the same thing as your Python code. It counts the number of each alphabetic and numeric character in the input string, then iteratively finds the minimum number of characters to remove to make the string alphanumeric. The result is printed to the standard output.
<|EOT|>
