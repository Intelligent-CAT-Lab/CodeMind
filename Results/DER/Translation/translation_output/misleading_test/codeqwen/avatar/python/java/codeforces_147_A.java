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

Please note that in Java, we use `System.in` to read input from the console and `System.out.println` to print output to the console. The `Scanner` class is used to read input from the console. The `String.join` method is used to join the elements of an array into a string, and the `String.split` method is used to split a string into an array of substrings based on a delimiter. The `String.trim` method is used to remove leading and trailing whitespace from a string. The `char[]` array is used to iterate over each character in the string `t`.
