Certainly! Here is the equivalent Java code for the provided Python script:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        
        if (n == 1) {
            System.out.println("Hello World");
            System.exit(0);
        }
        
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        System.out.println(a + b);
        
        scanner.close();
    }
}
```

Note that in Java, we need to import the `Scanner` class to take input from the user, parse the input as integers, and use `System.out.println` to output to the console. The `System.exit(0)` call is used to terminate the program, which is equivalent to the `exit()` function in Python.
