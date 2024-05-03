Here is the Java version of the provided Python code:

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

This Java code does the same thing as the Python code: it reads a string from the user, and then prints out every second character of the string. The `substring` method in Java is used to extract a part of a string. The first parameter is the starting index, and the second parameter is the ending index. If the ending index is not provided, it will default to the length of the string. Since we want to print every second character, we start from index 0 and end at `s.length() / 2`.
