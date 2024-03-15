Here is the equivalent Java code to perform the same task:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        
        System.out.println(a * b + " " + (a + b) * 2);
        
        scanner.close();
    }
}
```

In Java, we use a `Scanner` to read inputs. The `nextInt()` method of the `Scanner` is used to get each integer value. We then perform the calculations and print the result in a single line, just like the Python code does.
