Here's the Java equivalent of the provided Python program. I'm assuming that you want to use the standard i/o for accepting the test input and providing the expected output.

```java
import java.util.Scanner;

public class RepeatNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();

        StringBuilder result = new StringBuilder();
        if (a <= b) {
            for (int i = 0; i < b; i++) {
                result.append(a);
            }
        } else {
            for (int i = 0; i < a; i++) {
                result.append(b);
            }
        }

        System.out.print(result.toString());
    }
}
```

To compile and run this Java program, save it to a file called `RepeatNumbers.java`, and then use the following commands in the terminal:

```
javac RepeatNumbers.java
java RepeatNumbers
```

Provide the test input "4 3" when prompted, and the program will produce the expected output "3322".
