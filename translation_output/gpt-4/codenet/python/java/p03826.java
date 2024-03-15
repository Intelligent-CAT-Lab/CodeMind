Here is the equivalent Java code for the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        int s = a * b;
        int t = c * d;

        if (s > t) {
            System.out.println(s);
        } else {
            System.out.println(t);
        }

        scanner.close();
    }
}
```

Make sure to include the 'Scanner' import line at the top of your code, as it is necessary for using the Scanner class to read input from the user.
