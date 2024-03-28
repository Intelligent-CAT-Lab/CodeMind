Below is the Java translation of the given Python code, encapsulating the logic into a simple program which reads input from the standard input, processes it, and outputs the result:

```java
import java.util.Scanner;

public class EqualityCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        
        if (number1 == number2) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        
        scanner.close();
    }
}
```

This Java program will perform similarly to the given Python script. It uses `Scanner` to get the input from the user, and then it performs a comparison operation. If the numbers are equal, it prints "Yes"; otherwise, it prints "No". Remember to ensure that this code is run with correct input (two integers separated by a space) to produce the expected output.
