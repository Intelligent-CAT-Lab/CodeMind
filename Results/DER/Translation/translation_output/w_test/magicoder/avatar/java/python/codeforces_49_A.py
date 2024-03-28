<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
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

@@ Response
Here is the equivalent Python code:

```python
def check_last_char(question):
    vowels = ['A', 'E', 'I', 'O', 'U', 'Y']
    ch = question[-1]
    if ch in vowels or ch.lower() in vowels:
        return "YES"
    else:
        return "NO"

question = input().strip()
print(check_last_char(question))
```

This Python code does the same thing as the Java code. It reads a line of input, strips any leading or trailing whitespace, and checks the last character. If the last character is a vowel (either uppercase or lowercase), it prints "YES". Otherwise, it prints "NO".<｜end▁of▁sentence｜>
