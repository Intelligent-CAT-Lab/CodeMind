Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int D = scanner.nextInt();
        scanner.close();

        String[] days = {"", "Christmas", "Christmas Eve", "Christmas Eve Eve", "Christmas Eve Eve Eve"};
        System.out.println(days[D]);
    }
}
```

This Java code does the same thing as your Python code. It reads an integer from the user, then prints out the corresponding string from the array. The array is indexed by the input integer, so the output will be the string at the index equal to the input integer.
