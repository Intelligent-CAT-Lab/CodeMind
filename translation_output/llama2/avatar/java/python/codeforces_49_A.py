<s> Translate the following java code to python and enclose your solution inside ```python```:
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

### 解答

```python
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

def main():
    scanner = Scanner(System.in)
    question = scanner.nextLine().strip()
    originalQ = question[:-1].strip()
    ch = originalQ[-1]
    vowels = ['A', 'E', 'I', 'O', 'U', 'Y']
    b = any(e.lower() == ch.lower() or e.lower() == ch.upper() for e in vowels)
    print(b and 'YES' or 'NO')

if __name__ == '__main__':
    main()
```

### 解析

1. 将java的`import`语句转换为python的`import`语句
2. 将java的`public static void main(String[] args)`转换为python的`def main():`
3. 将java的`Scanner scanner = new Scanner(System.in);`转换为python的`scanner = Scanner(System.in)`
4. 将java的`String question = scanner.nextLine().trim();`转换为python的`question = scanner.nextLine().strip()`
5. 将java的`String originalQ = question.substring(0, question.length() - 1).trim();`转换为python的`originalQ = question[:-1].strip()`
6. 将java的`String ch = originalQ.substring(originalQ.length() - 1);`转换为python的`ch = originalQ[-1]`
7. 将java的`String[] vowels = new String[]{"A", "E", "I", "O", "U", "Y"};`转换为python的`vowels = ['A', 'E', 'I', 'O', 'U', 'Y']`
8. 将java的`boolean b = Arrays.stream(vowels).anyMatch(e -> e.equalsIgnoreCase(ch) || e.toLowerCase(Locale.US).equalsIgnoreCase(ch));`转换为python的`b = any(e.lower() == ch.lower() or e.lower() == ch.upper() for e in vowels)`
9. 将java的`System.out.println(b ? "YES" : "NO");`转换为python的`print(b and 'YES' or 'NO')`

### 思路

1. 将java的`import`语句转换为python的`import`语句

    ```python
    import java.util.Arrays;
    import java.util.Locale;
    import java.util.Scanner;
    ```

    ```python
    import java.util
    import java.util.Arrays
    import java.util.Locale
    import java.util.Scanner
    ```

2. 将java的`public static void main(String[] args)`转换为python的`def main():`

    ```python
    public static void main(String[] args)
    ```

    ```python
    def main():
    ```

3. 将java的`Scanner scanner = new Scanner(System.in);`转换为python的`scanner = Scanner(System.in)`

    ```python
    Scanner scanner = new Scanner(System.in);
    ```

    ```python
    scanner = Scanner(System.in)
    ```

4. 将java的`String question = scanner.nextLine().trim();`转换为python的`question = scanner.nextLine().strip()`

    ```python
    String question = scanner.nextLine().trim();
    ```

    ```python
    question = scanner.nextLine().strip()
    ```

5. 将java的`String originalQ = question.substring(0, question.length() - 1).trim();`转换为python的`originalQ = question[:-1].strip()`

    ```python
    String originalQ = question.substring(0, question.length() - 1).trim();
    ```

    ```python
    originalQ = question[:-1].strip()
    ```

6. 将java的`String ch = originalQ.substring(originalQ.length() - 1);`转换为python的`ch = originalQ[-1]`

    ```python
    String ch = originalQ.substring(originalQ.length() - 1);
    ```

    ```python
    ch = originalQ[-1]
    ```

7. 将java的`String[] vowels = new String[]{"A", "E", "I", "O", "U", "Y"};`转换为python的`vowels = ['A', 'E', 'I', 'O', 'U', 'Y']`

    ```python
    String[] vowels = new String[]{"A", "E", "I", "O", "U", "Y"};
    ```

    ```python
    vowels = ['A', 'E', 'I', 'O', 'U', 'Y']
    ```

8. 将java的`boolean b = Arrays.stream(vowels).anyMatch(e -> e.equalsIgnoreCase(ch) || e.toLowerCase(Locale.US).equalsIgnoreCase(ch));`转换为python的`b = any(e.lower() == ch.lower() or e.lower() == ch.upper() for e in vowels)`

    ```python
    boolean b = Arrays.stream(vowels).anyMatch(e -> e.equalsIgnoreCase(ch) || e.toLowerCase(Locale.US).equalsIgnoreCase(ch));
    ```

    ```python
    b = any(e.lower() == ch.lower() or e.lower() == ch.upper() for e in vowels)
    ```

9. 将java的`System.out.println(b ? "YES" : "NO");`转换为python的`print(b and 'YES' or 'NO')`

    ```python
    System.out.println(b ? "YES" : "NO");
    ```

    ```python
    print(b and 'YES' or 'NO')
    ```

### 总结

1. 将java的`import`语句转换为python的`import`语句
2. 将java的`public static void main(String[] args)`转换为python的`def main():`
3. 将java的`Scanner scanner = new Scanner(System.in);`转换为python的`scanner = Scanner(System.in)`
4. 将java的`String question = scanner.nextLine().trim();`转换为python的`question = scanner.nextLine().strip()`
5. 将java的`String originalQ = question.substring(0, question.length() - 1).trim();`转换为python的`originalQ = question[:-1].strip()`
6. 将java的`String ch = originalQ.substring(originalQ.length() - 1);`转换为python的`ch = originalQ[-1]`
7. 将java的`String[] vowels = new String[]{"A", "E", "I", "O", "U", "Y"};`转换为python的`vowels = ['A', 'E', 'I', 'O', 'U', 'Y']`
8. 将java的`boolean b = Arrays.stream(vowels).anyMatch(e -> e.equals
