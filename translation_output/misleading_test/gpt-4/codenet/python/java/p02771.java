Here's the translated Java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        scanner.close();

        if ((a == b && b != c) || (b == c && a != b) || (a == c && a != b)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
```

To run the test case, you would input `5 7 5` and the expected output would be `Yes`. Make sure to compile and execute the code in a Java environment.
