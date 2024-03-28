Certainly! Below is the equivalent code in Java:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        
        int maxResult = Math.max(Math.max(a - b, a + b), a * b);
        System.out.println(maxResult);
        
        scanner.close();
    }
}
```

This Java program will perform the same operations as the provided Python code by taking two integer inputs from the user, then calculating and printing the maximum value among their difference (a-b), sum (a+b), and product (a*b).
