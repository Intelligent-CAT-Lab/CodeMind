Here is the Java equivalent of the Python code you provided:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(s.substring(0, s.length() / 2));
    }
}
```

In this Java code, we use the `Scanner` class to read the input from the user. The `substring` method is used to get a substring of the input string from the beginning to the middle of the string. The length of the string is divided by 2 to get the index of the middle character. If the length of the string is odd, the middle character will be included in the substring.
