<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
0

Expected output:
-27

```
import java.util.Scanner;

public class atcoder_ABC120_C {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        char[] s1 = sc.next().toCharArray();
        int ans = 0;
        int c1 = 0;
        int c0 = 0;
        
        for (int i = 0; i < s1.length; i++) {
            if (s1[i] == '1') {
                if (c0 > 0) {
                    c0--;
                    ans++;
                } else {
                    c1++;
                }
            } else {
                if (c1 > 0) {
                    c1--;
                    ans++;
                } else {
                    c0++;
                }
            }
        }
        
        System.out.println(ans * 2);
    }
}
```

@@ Response
```python
s1 = input()
ans = 0
c1 = 0
c0 = 0

for i in s1:
    if i == '1':
        if c0 > 0:
            c0 -= 1
            ans += 1
        else:
            c1 += 1
    else:
        if c1 > 0:
            c1 -= 1
            ans += 1
        else:
            c0 += 1

print(ans * 2)
```

This Python code does the same thing as the Java code. It reads a string from the user, then iterates over each character in the string. If the character is '1', it checks if there are any '0's left to flip. If there are, it flips one '1' to '0' and increments the answer. If there are no '0's left to flip, it increments the count of '1's. If the character is '0', it does the same thing but for '1's. Finally, it prints the answer multiplied by 2.<｜end▁of▁sentence｜>
