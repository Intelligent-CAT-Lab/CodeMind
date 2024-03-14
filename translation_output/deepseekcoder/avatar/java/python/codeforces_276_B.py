<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
```
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
```

### Response:
```python
import sys

def main():
    s = sys.stdin.readline().strip()
    ar = [0]*26

    for ch in s:
        ar[ord(ch) - 97] += 1

    cntod = 0
    for i in range(26):
        if ar[i] % 2 != 0:
            cntod += 1

    if cntod == 0:
        print("First")
    else:
        if cntod % 2 == 0:
            print("Second")
        else:
            print("First")

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads a string from the standard input, counts the occurrences of each character in the string, and then determines whether the first player or the second player (who plays optimally) can win. The game is a variant of the game of Nim where the rules are as follows: the first player can remove any number of characters from the string, but the second player can only remove characters that are at an even index. The first player wins if and only if the number of characters left is even.
<|EOT|>
