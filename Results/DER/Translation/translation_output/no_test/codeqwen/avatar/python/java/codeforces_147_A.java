Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String t = ", . ? ! ";
        for (char i : t.toCharArray()) {
            s = s.replace(i + "", i + " ");
        }
        s = " ".join(s.trim().split(" "));
        for (char i : t.toCharArray()) {
            s = s.replace(" " + i, i);
        }
        System.out.println(s);
    }
}
```

Please note that in Java, we use `System.in` to get user input, and `System.out.println` to print output. Also, Java does not have a built-in `join` method for strings, so we use `String.join` with an array of strings. The `trim` method is used to remove leading and trailing spaces from the string. The `split` method is used to split the string into an array of strings based on a delimiter. The `replace` method is used to replace occurrences of a substring with another substring.
