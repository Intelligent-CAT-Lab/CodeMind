Here's the equivalent Java code based on the provided Python script:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String moto = scanner.nextLine();
        String s = moto;
        String gene = "ABC";
        boolean f = true;
        List<String> log = new ArrayList<>();

        while (s.length() > 3 && f) {
            f = false;
            if (s.startsWith("ABC")) {
                s = s.replaceFirst("ABC", "A");
                log.add("A");
                f = true;
            } else if (s.endsWith("ABC")) {
                s = s.replaceAll("ABC(?=\\z)", "C");
                log.add("C");
                f = true;
            } else if (s.contains("ABC")) {
                s = s.replaceFirst("ABC", "B");
                log.add("B");
                f = true;
            }
        }

        if (!s.equals(gene)) {
            System.out.println("No");
            System.exit(0);
        }

        int l = log.size();
        for (int i = 0; i < l; i++) {
            s = s.replace(log.get(l - 1 - i), "ABC");
        }

        if (s.equals(moto)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        scanner.close();
    }
}
```

Important notes for the translation process:

1. Java requires more setup, such as class and main method declaration.
2. For input, we use a `Scanner` object.
3. The `replaceFirst` method in Java replaces the first occurrence in the string, similar to `replace` in Python when it's only given one instance to replace.
4. The `String` class is immutable in Java, so it's not necessary to create a new string like in Python.
5. Java does not have a `print` method as in Python, so `System.out.println` is used instead.
6. In the second replacement, instead of slicing as in Python, we use `replaceAll` with a lookahead regular expression to match 'ABC' at the end of the string.
7. The `System.exit(0)` method is used to exit the program, similar to `exit()` in Python.
8. Python's `list` is replaced with Java's `ArrayList` and accessed via the `get` method.
9. Loops and conditional statements are very similar between the two languages, with minor syntactic differences.
