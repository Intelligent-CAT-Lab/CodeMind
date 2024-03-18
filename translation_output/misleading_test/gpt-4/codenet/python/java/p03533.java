Below is the translated Python code into Java. It uses the `Pattern` and `Matcher` classes from the `java.util.regex` package to perform the regular expression matching:

```java
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String pattern = "^A?KIHA?BA?RA?$";
        String S = scanner.nextLine();
        scanner.close();

        if (Pattern.matches(pattern, S)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
```

You can compile and run this Java program, and if you provide `KIHBR` as input, it will output `YES`, as expected.
