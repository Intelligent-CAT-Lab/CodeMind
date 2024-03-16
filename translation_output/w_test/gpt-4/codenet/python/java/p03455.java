Here's the translated Java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = a * b;
        
        if (c % 2 == 1) {
            System.out.println("Odd");
        } else {
            System.out.println("Even");
        }
        
        scanner.close();
    }
}
```

This code will produce equivalent results to the provided Python code when given similar input. Remember, when you run this Java code, you'll need to compile it first and then execute the compiled class file. 

For instance, if you save this code in a file named `Main.java`, you would compile it with `javac Main.java` and run it with `java Main`. You will then be prompted to enter two numbers separated by a space (the test input). The program will then output "Even" or "Odd" depending on the product of the two numbers.
