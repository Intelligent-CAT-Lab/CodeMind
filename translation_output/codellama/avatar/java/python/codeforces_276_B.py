<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java Code:

import java.util.*;

public class codeforces_276_B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        char ar[] = new char[26];
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            ar[ch - 97]++;
        }
        
        int cntod = 0;
        for (int i = 0; i < 26; i++) {
            if ((ar[i] % 2) != 0)
                cntod++;
        }
        
        if (cntod == 0)
            System.out.println("First");
        else {
            if (cntod % 2 == 0) {
                System.out.println("Second");
            } else {
                System.out.println("First");
            }
        }
    }
}

Translate the above java code to python.

python Code:

[/INST]
```python
import sys

s = sys.stdin.readline().strip()
ar = [0] * 26

for ch in s:
    ar[ord(ch) - ord('a')] += 1

cnt_od = 0
for i in range(26):
    if ar[i] % 2 != 0:
        cnt_od += 1

if cnt_od == 0:
    print("First")
else:
    if cnt_od % 2 == 0:
        print("Second")
    else:
        print("First")
```
Note: In Python, we can use the `ord()` function to get the ASCII value of a character, and we can use the `strip()` method to remove the newline character from the end of the input string.</s>
