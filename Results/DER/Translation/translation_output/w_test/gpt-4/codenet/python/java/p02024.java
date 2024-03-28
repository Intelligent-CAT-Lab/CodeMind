Below is the translated Python code into Java. I've created a SimpleTest class coupled with a main method to replicate a similar test case to your provided input. Please note that Java requires more boilerplate code than Python.

```java
import java.util.Scanner;

public class SimpleTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int w = scanner.nextInt();
        int s = scanner.nextInt();
        int t = scanner.nextInt();
        
        if (h * w % 2 == 1) {
            if ((s + t) % 2 == 1) {
                System.out.println("No");
            } else {
                System.out.println("Yes");
            }
        } else {
            System.out.println("Yes");
        }
        
        scanner.close();
    }
}
```

To execute the above Java program, it expects user input in the same format as your test input: `4 5 2 3`. The program will then output `Yes` as expected. If you want to run a specific test case without manually entering the values, you can simulate input by modifying the code or using command-line argument parsing, or redirection of input in the execution environment. 

Please note that Java uses `System.in` to get input from the user, which is a bit different than Python's `input()` built-in function. The above code assumes that the inputs will be provided as space-separated values in the standard input.
