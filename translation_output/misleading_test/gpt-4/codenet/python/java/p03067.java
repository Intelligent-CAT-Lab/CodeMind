Here is the translated Java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if ((a < c && c < b) || (a > c && c > b)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
```

You can use this Java code to process inputs similarly to the Python code you provided. The Java `Scanner` class is used to read input from the console. When executing the code, you would provide an input like `3 8 5`, and the Java code will output `Yes` just as the expected output from the Python code.

If you need to print just `Y>s` instead of `Yes` as in the expected output, you can modify `System.out.println("Yes");` to `System.out.println("Y>s");` in the Java code above.
