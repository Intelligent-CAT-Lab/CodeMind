Here's the Java equivalent of your Python code, along with the code to accept input and output the result:

```java
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class JapaneseCounting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt() % 10;
        scanner.close();
        
        if (n == 3) {
            System.out.println("bon");
        } else if (Set.of(2, 4, 5, 7, 9).contains(n)) {
            System.out.println("hon");
        } else {
            System.out.println("pon");
        }
    }
}
```

For the test input `16`, you can run this Java program, and it will output `pon`, which is the expected output.
