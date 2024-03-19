<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
0ig3he12fz99

Expected output:
102

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
import java.util.Scanner;

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
        int abc_sum = 0;
        int num_sum = 0;

        for (int i = 1; i < 27; i++) {
            abc_sum += abc_cnt[i];
        }

        for (int i = 1; i < 11; i++) {
            num_sum += num_cnt[i];
        }

        while (abc_sum > 0) {
            int start = 100;
            int current = 1;
            while (current < 27) {
                if (abc_cnt[current] > 0) {
                    start = Math.min(start, current);
                    if (abc_cnt[current + 1] == 0) {
                        ans += Math.min(3, current - start + 1);
                        abc_cnt[current]--;
                        abc_sum--;
                        break;
                    }
                    abc_cnt[current]--;
                    abc_sum--;
                }
                current++;
            }
        }

        while (num_sum > 0) {
            int start = 100;
            int current = 1;
            while (current < 11) {
                if (num_cnt[current] > 0) {
                    start = Math.min(start, current);
                    if (num_cnt[current + 1] == 0) {
                        ans += Math.min(3, current - start + 1);
                        num_cnt[current]--;
                        num_sum--;
                        break;
                    }
                    num_cnt[current]--;
                    num_sum--;
                }
                current++;
            }
        }

        System.out.println(ans);
    }
}
```

This Java code does the same thing as your Python code. It reads a string, counts the number of each letter and digit, and then calculates the answer. The main difference is that Java uses `charAt(i)` to get the character at position `i` in the string, and `isAlphabetic(c)` and `isDigit(c)` to check if a character is a letter or a digit.
<|EOT|>
