<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

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





Translate the above python code to java.

java code:

[/INST]

Here is the Java code that translates the Python code:

```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();

        int[] s_frq_dict = new int[26];
        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            if (c >= 'a' && c <= 'z') {
                s_frq_dict[c - 'a']++;
            }
        }

        int max = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < 26; i++) {
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

Note that the Java code uses a different approach to calculate the frequency of each character in the string. It uses an array of integers to store the frequency of each character, and it uses the `charAt()` method to access the characters in the string. The `Scanner` class is used to read the input from the user.</s>
