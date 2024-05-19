System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
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


Answer:
```python
def is_vowel(ch):
    vowels = ['A', 'E', 'I', 'O', 'U', 'Y']
    return any(vowel.lower() == ch.lower() for vowel in vowels)

question = input().strip()
original_q = question[:-1].strip()
ch = original_q[-1]

print("YES" if is_vowel(ch) else "NO")
```

You can write the following test cases to ensure it works correctly:

```python
test_inputs = [
    "BueDOlxgzeNlxrzRrMbKiQdmGujEKmGxclvaPpTuHmTqBp?",
    "This is a test question.",
    "Hello, World!"
]

expected_outputs = [
    "NO",
    "YES",
    "NO"
]

for test_input, expected_output in zip(test_inputs, expected_outputs):
    print(f"Input: {test_input}")
    print(f"Expected Output: {expected_output}")
    print(f"Actual Output: {is_vowel(test_input[-1])}")
    print()
```<|endoftext|>
