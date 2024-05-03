Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();

        char[] aArray = a.toCharArray();

        for (int i = 0; i < aArray.length; i++) {
            if (aArray[i] == '?') {
                aArray[i] = 'D';
            }
        }

        String b = new String(aArray);

        System.out.println(b);
    }
}
```

This Java code does the same thing as your Python code. It reads a string from the user, replaces all question marks with 'D', and then prints the resulting string.
