Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
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
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class codeforces_49_A:
    def main(self):
        scanner = Scanner(System.in)
        question = scanner.nextLine().strip()
        originalQ = question[:-1].strip()
        ch = originalQ[-1]
        vowels = ["A", "E", "I", "O", "U", "Y"]
        b = any(e.lower() == ch.lower() or e == ch for e in vowels)
        print("YES" if b else "NO")

if __name__ == '__main__':
    codeforces_49_A().main()
```

Explanation:

- We import the necessary classes from the java package.
- We create a `Scanner` object to read input from the user.
- We read the input string from the user and remove any leading or trailing whitespaces using the `strip()` method.
- We extract the last character of the original question string using the `[-1]` index.
- We create a list of vowels.
- We use the `any()` function to check if the last character of the original question string is present in the list of vowels. We use the `lower()` method to compare the characters in a case-insensitive manner.
- We print "YES" if the condition is true, otherwise we print "NO".<|endoftext|>
