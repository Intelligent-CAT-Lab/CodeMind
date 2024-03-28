Here is the equivalent Java code for the given Python script:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String X = scanner.next();
        String ans;

        if (X.equals("7") || X.equals("5") || X.equals("3")) {
            ans = "YES";
        } else {
            ans = "NO";
        }

        System.out.println(ans);

        scanner.close();
    }
}
```

This Java code does the same thing as the Python code: it reads a string from the input, checks if it is '7', '5', or '3', and then prints 'YES' or 'NO' accordingly.
