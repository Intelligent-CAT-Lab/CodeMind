<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
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

### Response:
```python
def codeforces_49_A(question):
    originalQ = question[:-1].strip()
    ch = question[-1]
    vowels = ['A', 'E', 'I', 'O', 'U', 'Y']
    b = any(e.lower() == ch.lower() for e in vowels)
    return "YES" if b else "NO"

# Test input
print(codeforces_49_A("BueDOlxgzeNlxrzRrMbKiQdmGujEKmGxclvaPpTuHmTqBp?"))
```

In this Python solution, we define a function `codeforces_49_A` that takes a string `question` as input. We extract the last character `ch` and the rest of the string `originalQ`. We then check if `ch` is in the list of vowels. The function returns "YES" if `ch` is a vowel and "NO" otherwise. The last line of the code is a test case that uses the function with the provided input.
<|EOT|>
