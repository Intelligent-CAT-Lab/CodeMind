<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
BueDOlxgzeNlxrzRrMbKiQdmGujEKmGxclvaPpTuHmTqBp?

Expected output:
NO


```
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class codeforces_49_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String question = scanner.nextLine().trim();
        String originalQ = question.substring(0, question.length() - 1).trim();
        String ch = originalQ.substring(originalQ.length() - 1);
        String[] vowels = new String[]{"A", "E", "I", "O", "U", "Y"};
        boolean b = Arrays.stream(vowels)
                .anyMatch(e -> e.equalsIgnoreCase(ch) || e.toLowerCase(Locale.US).equalsIgnoreCase(ch));
        System.out.println(b ? "YES" : "NO");
    }
}
```

### Response:
```python
import re

def is_vowel(ch):
    vowels = ['A', 'E', 'I', 'O', 'U', 'Y']
    return ch in vowels

def check_question(question):
    originalQ = question[:-1]
    ch = question[-1]
    return is_vowel(ch) or is_vowel(ch.lower())

def main():
    question = input().strip()
    print("YES" if check_question(question) else "NO")

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads a line of input, checks the last character of the input string to see if it is a vowel (either uppercase or lowercase), and prints "YES" if it is, "NO" otherwise.
<|EOT|>
