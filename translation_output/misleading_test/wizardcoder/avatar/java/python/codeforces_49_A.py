Below is an instruction that describes a task. Write a response that appropriately completes the request.

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
        System.out.println(b? "YES" : "NO");
    }
}
```

### Response:
```python
import re

def is_vowel(ch):
    vowels = ['a', 'e', 'i', 'o', 'u', 'y']
    return ch.lower() in vowels

def is_last_vowel(question):
    ch = question[-1]
    return is_vowel(ch)

question = input().strip()
original_question = question[:-1].strip()
last_char = original_question[-1]

if is_last_vowel(original_question):
    print('N')
else:
    print('Y')
```

Explanation:

- We import the `re` module to use regular expressions.
- We define a function `is_vowel` that takes a character and returns `True` if it is a vowel, `False` otherwise.
- We define a function `is_last_vowel` that takes a string and returns `True` if the last character is a vowel, `False` otherwise.
- We read the input string `question` and remove the last character using string slicing.
- We remove any leading or trailing whitespaces using the `strip` method.
- We check if the last character of the original question is a vowel using the `is_last_vowel` function.
- If it is, we print `N`. Otherwise, we print `Y`.<|endoftext|>
