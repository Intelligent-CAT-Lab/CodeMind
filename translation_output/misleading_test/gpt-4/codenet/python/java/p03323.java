Below is the translated Java code that performs the same operation as the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        
        if (a < 9 && b < 9) {
            System.out.println("Yay!");
        } else {
            System.out.println(":(");
        }
        scanner.close();
    }
}
```

To run this Java program, you would need to compile it using a Java compiler (e.g., `javac Main.java`) and then run the compiled bytecode with the Java Runtime Environment (e.g., `java Main`). Input should be provided in the same way as the Python example: by entering two integers separated by a space on a single line.

Regarding the sample test case provided ("5 4"), it seems to contain a typo as the expected output (".bih") does not match the output that the given Python code would produce. The Python code checks whether both input numbers are less than 9 and prints "Yay!" if this condition is true; otherwise, it prints ":(". No output ".bih" fits the logic of the given Python code or the test case.
