Certainly! Below is the translated Python code into Java:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputs = scanner.nextLine().split(" ");
        
        int a = Integer.parseInt(inputs[0]);
        int b = Integer.parseInt(inputs[1].charAt(0) + inputs[1].substring(2));
        
        System.out.println((long) a * b / 100);
        
        scanner.close();
    }
}
```

To compile and run this Java program, make sure you have a Java Development Kit (JDK) installed, and use the following commands in your terminal:

To compile:
```
javac Main.java
```

To run:
```
java Main
```

You'll then be prompted to input the test case. Note that in the Python sample, there is an implicit assumption that the result of `a * b` will fit within the bounds of a Python integer (which is unbounded). In Java, the data types have fixed sizes, and since the product of two large integers can exceed the bounds of an `int`, I've used a long for the result in `System.out.println`. If even larger numbers are expected, you might need to use `java.math.BigInteger` instead.
