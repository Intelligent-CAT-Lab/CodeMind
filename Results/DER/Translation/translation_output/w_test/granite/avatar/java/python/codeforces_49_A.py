System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
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


Answer:
```python
def is_vowel(c):
    vowels = ['A', 'E', 'I', 'O', 'U', 'Y']
    return c.upper() in vowels or c.lower() in vowels

def main():
    question = input().strip()
    original_q = question[:-1].strip()
    last_char = original_q[-1]
    if is_vowel(last_char):
        print("YES")
    else:
        print("NO")

if __name__ == "__main__":
    main()
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

for i, test_input in enumerate(test_inputs):
    output = main(test_input)
    assert output == expected_outputs[i], f"Test failed for input: {test_input}"

print("All tests passed!")
```<|endoftext|>
