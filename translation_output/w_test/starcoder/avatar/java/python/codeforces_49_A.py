<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```.
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
        System.out.println(b? "YES" : "NO");
    }
}
```

python code:<fim_suffix><fim_middle>

```python
import string

def is_vowel(ch):
    return ch in "AEIOUYaeiouy"

def is_question(question):
    original_question = question[:-1]
    ch = original_question[-1]
    return is_vowel(ch) or is_vowel(ch.lower())

if __name__ == "__main__":
    question = input()
    print("YES" if is_question(question) else "NO")
```

"""
<|endoftext|>
