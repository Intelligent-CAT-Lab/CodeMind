Below is the translated Java program from your given Python code. The Java program reads from the standard input, processes the input as an integer, calculates the cube of that integer, and prints the result to the standard output.

```java
import java.util.Scanner;

public class CubeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (scanner.hasNextLine()) {
            String input = scanner.nextLine();
            try {
                int n = Integer.parseInt(input.split("\\s+")[0]);
                System.out.println((int) Math.pow(n, 3));
            } catch (NumberFormatException e) {
                System.err.println("Invalid input, please enter a valid integer");
                break;
            }
        }
        
        scanner.close();
    }
}
```

Test this Java program by inputting the number `2` through the standard input when prompted or by providing an input file with the number `2`. It will output `8`, as you have specified in the expected output.

Please note that Java has strong type-checking at compile-time, and so type issues must be dealt with more explicitly than in Python. Also, Java uses the class and methods structure even for simple programs, unlike Python, where you can write scripts without defining a class.
