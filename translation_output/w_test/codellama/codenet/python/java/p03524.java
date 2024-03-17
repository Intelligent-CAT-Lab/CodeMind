<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
abac

Expected output:
YES


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
[/INST]
```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();

        int[] s_frq_dict = new int[3];
        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            if (c == 'a') {
                s_frq_dict[0]++;
            } else if (c == 'b') {
                s_frq_dict[1]++;
            } else if (c == 'c') {
                s_frq_dict[2]++;
            }
        }

        int max = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < s_frq_dict.length; i++) {
            if (s_frq_dict[i] > max) {
                max = s_frq_dict[i];
            }
            if (s_frq_dict[i] < min) {
                min = s_frq_dict[i];
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
Note: This solution uses a `Scanner` to read the input from the user, and a `String` to store the input. It then uses a `for` loop to iterate over the characters in the string and increment the frequency of each character in an array. Finally, it uses a `for` loop to find the maximum and minimum frequency, and checks if the difference between them is less than or equal to 1. If it is, it prints "YES", otherwise it prints "NO".</s>
