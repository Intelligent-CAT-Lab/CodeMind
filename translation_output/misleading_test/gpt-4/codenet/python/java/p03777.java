Here is the Java equivalent of the given Python code. The Java program takes input from the user, processes it according to the given logic, and outputs the result:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        String b = scanner.next();

        if (a.equals("H")) {
            System.out.print(b);
        } else {
            if (b.equals("H")) {
                System.out.print("D");
            } else {
                System.out.print("H");
            }
        }
    }
}
```

To test this Java code with the given test input "H H", you would need to compile and run the `Main` class, then supply the input when prompted. The expected output for this input would be:

Expected output:

```
H
```
