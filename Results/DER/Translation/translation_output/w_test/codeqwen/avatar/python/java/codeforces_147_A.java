Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String t = ", . ? !";
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

Please note that in Java, the `join` method is not available for Strings. Therefore, we use `String.join` method to join the array of strings. Also, the `split` method in Java returns an array of strings, so we use `Arrays.toString` to convert it to a string.

Also, the `replace` method in Java replaces all occurrences of a substring, not just the first one. Therefore, we use a loop to replace all occurrences of each character in the string `t`.

Finally, the `trim` method is used to remove leading and trailing spaces from the string `s`.
