<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```.
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

python code:<fim_suffix><fim_middle>

```python
import sys

def main():
    question = sys.stdin.readline().strip()
    originalQ = question[:-1].strip()
    ch = originalQ[-1]
    vowels = ["A", "E", "I", "O", "U", "Y"]
    b = any(e.lower() == ch.lower() or e == ch for e in vowels)
    print("YES" if b else "NO")

if __name__ == "__main__":
    main()
```
"""
<|endoftext|>
