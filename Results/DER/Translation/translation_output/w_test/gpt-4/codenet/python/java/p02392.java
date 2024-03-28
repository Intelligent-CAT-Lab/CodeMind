Here is the equivalent Java code for the provided Python script. Note that since Java is a statically-typed language, the input handling is more verbose compared to Python.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a < b && b < c) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        
        scanner.close();
    }
}
```

To compile and run the Java code, make sure you have a Java development environment set up and use the `javac` command to compile and the `java` command to run the program:

```
javac Main.java
java Main
```

Enter the test input `1 3 8`, and you should see the expected output `Yes`.
