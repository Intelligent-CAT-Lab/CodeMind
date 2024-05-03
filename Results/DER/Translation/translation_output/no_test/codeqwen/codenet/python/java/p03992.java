Here is the Java equivalent of the Python code you provided:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(s.substring(0, 4) + " " + s.substring(4));
    }
}
```

In this Java code, we use the `Scanner` class to read the input from the user. The `substring` method is used to extract the substring from the input string. The first parameter of the `substring` method is the starting index and the second parameter is the ending index. If the second parameter is not provided, it will extract the substring till the end of the string.
