System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```:
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
import re

question = input().strip()
original_q = re.sub(r'[^a-zA-Z]', '', question)
ch = original_q[-1]
vowels = ['A', 'E', 'I', 'O', 'U', 'Y']

if any(vowel.lower() == ch.lower() for vowel in vowels):
    print("YES")
else:
    print("NO")
```<|endoftext|>
