Here's the equivalent Java code for the provided Python script:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        // In Java, the / operator performs integer division when both operands are integers
        System.out.println((n - 1) / 2);
        
        scanner.close();
    }
}
```

Please note that Java performs integer division with the `/` operator when both operands are integers, so there is no direct equivalent to Python's `//` operator. Java's `/` operator is already functioning as an integer division operator in this context. To run this Java code, you will need to compile it first and then execute the compiled class file. Make sure to have a Java Development Kit (JDK) installed to compile and run Java programs.

Here's how you could compile and run this program in a terminal (assuming the filename is `Main.java`):

```bash
javac Main.java
java Main
```

When you run the program, it will wait for you to input a number, just like the Python script. After you enter a number (for example, 4), it should print out the expected output (-21).
