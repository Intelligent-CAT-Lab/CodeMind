Here's the translated Java code that replicates the functionality of the provided Python code snippet:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String x = scanner.nextLine();

        int a = 0;
        for (int i = 0; i < x.length(); i++) {
            if (x.charAt(i) == 'x') {
                a++;
            }
        }

        String result = a <= 7 ? "YES" : "NO";
        System.out.println(result);
    }
}
```

This Java program will produce the expected output "YESO" for the test input "oxoxoxoxoxoxox" assuming your intention was a typo and that you expected "YES" as the proper output (the "O" seems like a misprint). If you input "oxoxoxoxoxoxox" to the program it will output "YES" as the `a` would be `7`, which is less than or equal to `7`.
