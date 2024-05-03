Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        int div = s.length() / 2;
        String pre = s.substring(0, div);
        String suf = s.substring(div + 1);

        if (s.equals(new StringBuilder(s).reverse().toString()) && pre.equals(new StringBuilder(pre).reverse().toString()) && suf.equals(new StringBuilder(suf).reverse().toString())) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
```

This Java code does the same thing as your Python code. It reads a string from the user, splits it into two halves, and checks if the string, both the whole string and the two halves, are palindromes. If they are, it prints "Yes", otherwise it prints "No".
