<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
#  --*-coding:utf-8-*--

def f(str):
    s = {}
    s[0] = 0
    pat = 0

    bits = [2**i for i in range(26)]
    lenOfStr = len(str)

    for c in str:
        pat ^= bits[ord(c)-97]
        s[pat] = min(
            min(s.get(pat^bit, lenOfStr) + 1 for bit in bits),
            s.get(pat, lenOfStr))

    if pat == 0:
        return 1

    return s[pat]
            
str = input()
print(f(str))


```

### Response:
Here is the Java version of your Python code:

```java
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.println(f(str));
    }

    public static int f(String str) {
        HashMap<Integer, Integer> s = new HashMap<>();
        s.put(0, 0);
        int pat = 0;

        int[] bits = new int[26];
        for (int i = 0; i < 26; i++) {
            bits[i] = (int) Math.pow(2, i);
        }
        int lenOfStr = str.length();

        for (char c : str.toCharArray()) {
            pat ^= bits[c - 'a'];
            int min = lenOfStr;
            for (int bit : bits) {
                int temp = s.getOrDefault(pat ^ bit, lenOfStr) + 1;
                if (temp < min) {
                    min = temp;
                }
            }
            s.put(pat, Math.min(min, s.getOrDefault(pat, lenOfStr)));
        }

        if (pat == 0) {
            return 1;
        }

        return s.get(pat);
    }
}
```

This Java code does the same thing as your Python code. It reads a string from the standard input, calculates the minimum number of changes to make the string palindrome, and prints the result. The calculation is done by XORing the bits of the string with each other and storing the minimum number of changes in a hash map. If the final pattern is 0, it returns 1, otherwise it returns the minimum number of changes from the hash map.
<|EOT|>
