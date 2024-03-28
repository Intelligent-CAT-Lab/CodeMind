<s> [INST] Translate the following java code to python and enclose your solution inside ```python```.
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
[/INST]
```python
import sys

def is_vowel(ch):
    return ch.lower() in ['a', 'e', 'i', 'o', 'u', 'y']

def is_question(question):
    if question[-1] not in ['?', '!']:
        return False
    return True

def main():
    question = input()
    if not is_question(question):
        print("Invalid input")
        sys.exit()
    vowels = ['A', 'E', 'I', 'O', 'U', 'Y']
    if any(is_vowel(ch) for ch in question[-1:]):
        print("YES")
    else:
        print("NO")

if __name__ == "__main__":
    main()
```</s>
