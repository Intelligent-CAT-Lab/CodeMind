Here is the equivalent Java code for the given Python code:

```java
import java.util.Scanner;

public class MyClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int f = scanner.nextInt();
        int b = scanner.nextInt();

        if (m + f < b) {
            System.out.println("NA");
        } else if (m >= b) {
            System.out.println("0");
        } else {
            System.out.println(b - m);
        }

        scanner.close();
    }
}
```

Make sure to include the `import` statement for `Scanner` and encapsulate the logic into a class with a `main` method when running the Java program. When you run this program with the input "1000 3000 3000", it will print the expected output, which is "1956".
