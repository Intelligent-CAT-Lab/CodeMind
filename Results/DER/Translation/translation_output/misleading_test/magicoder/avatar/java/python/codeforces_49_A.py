<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
BueDOlxgzeNlxrzRrMbKiQdmGujEKmGxclvaPpTuHmTqBp?

Expected output:
N

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

@@ Response
Here is the equivalent Python code:

```python
def main():
    question = input().strip()
    originalQ = question[:-1].strip()
    ch = originalQ[-1]
    vowels = ['A', 'E', 'I', 'O', 'U', 'Y']
    b = any(e.lower() == ch.lower() for e in vowels)
    print("YES" if b else "NO")

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads a line of input, removes trailing whitespace, and then checks if the last character is a vowel (ignoring case). If it is, it prints "YES"; otherwise, it prints "NO".<｜end▁of▁sentence｜>
