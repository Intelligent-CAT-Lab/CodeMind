<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p03211 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int min = 1000;
        for (int i = 0; i < S.length() - 2; i++) {
            int X = Integer.parseInt(S.substring(i, i + 3));
            min = Math.min(min, Math.abs(X - 753));
        }
        System.out.println(min);
        sc.close();
    }
}
```

@@ Response
```python
import sys

def main():
    S = input()
    min_diff = 1000
    for i in range(len(S) - 2):
        X = int(S[i:i+3])
        min_diff = min(min_diff, abs(X - 753))
    print(min_diff)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads a string from the standard input, then iterates over all possible substrings of length 3 in the string. For each substring, it calculates the absolute difference with 753 and updates the minimum difference found so far. Finally, it prints the minimum difference.<｜end▁of▁sentence｜>
