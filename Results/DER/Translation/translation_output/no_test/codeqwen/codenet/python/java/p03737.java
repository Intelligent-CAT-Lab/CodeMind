Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine().toUpperCase();
        String s2 = scanner.nextLine().toUpperCase();
        String s3 = scanner.nextLine().toUpperCase();
        System.out.println(s1.charAt(0) + "" + s2.charAt(0) + "" + s3.charAt(0));
    }
}
```

In this Java code, we are using `Scanner` class to take user input. The `nextLine()` method is used to read the input as a line of text. The `toUpperCase()` method is used to convert the input to uppercase. The `charAt(0)` method is used to get the first character of each string. The characters are then concatenated and printed to the console.
