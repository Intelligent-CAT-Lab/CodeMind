Sure, here's the Java code equivalent to the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (a > b) {
            System.out.println(a - 1);
        } else {
            System.out.println(a);
        }
    }
}
```

Here's how you would execute a sample test with the input provided ("5 5"):

```java
public class TestMain {
    public static void main(String[] args) {
        // Simulate input using a String and a Scanner
        String input = "5 5";
        Scanner scanner = new Scanner(input);
        
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        
        if (a > b) {
            System.out.println(a - 1);
        } else {
            System.out.println(a);
        }
        
        scanner.close();
    }
}
```

If you run the above `TestMain` class, it will produce the expected output of "5". Please note that in the original Python code, the output `33` does not match the provided test input ("5 5"), because "5 5" should yield output "5". If there's more context or different logic meant to achieve output "33", please provide additional instructions.
