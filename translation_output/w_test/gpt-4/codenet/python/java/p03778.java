Below is the equivalent Java code for the Python code sample you have provided. The Java version reads three integers from the input, calculates the result, and then prints it to the standard output.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int w = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (Math.abs(a - b) < w) {
            System.out.println(0);
        } else {
            System.out.println(Math.abs(a - b) - w);
        }

        scanner.close();
    }
}
```

To compile and run this code, you would save it to a file named `Main.java`, then execute the following commands in your terminal or command line, assuming you have the Java Development Kit (JDK) installed:

```
javac Main.java
java Main
```

When prompted, you would enter the test input "3 2 6" and the program should output the expected result "1".
