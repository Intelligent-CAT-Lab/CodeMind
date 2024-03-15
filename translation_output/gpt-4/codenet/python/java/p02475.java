Certainly! Below is the Python code translated into Java, maintaining the same functionality:

```java
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();
        
        System.out.println(round(a, b));
    }

    public static int round(int a, int b) {
        if (a * b < 0) {
            return -Math.floorDiv(-a, b);
        } else {
            return Math.floorDiv(a, b);
        }
    }
}
```

In this Java code, I used the `Scanner` class to read the integer inputs. The `Math.floorDiv` method is used to perform the integer division for both positive and negative cases, similar to the `//` operator in Python for the positive case. However, you need to take care of the negative case manually because Java doesn't handle negative division in the same way as Python's floor division.
