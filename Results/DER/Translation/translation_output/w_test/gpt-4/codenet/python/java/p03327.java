Below is the Java translation of your provided Python code, along with a simple way to take input and display the output:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        if (n < 1000) {
            System.out.println("ABC");
        } else {
            System.out.println("ABD");
        }
        scanner.close();
    }
}
```

In this Java code, I used `Scanner` to get user input from the console. The `if` statement works the same way as in Python, checking if the input is less than 1000. Depending on this check, it will print either `ABC` or `ABD` to the standard output.
