Here is the equivalent Java code for the provided Python script:

```java
import java.util.Scanner;

public class SoldierAndBananas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int n = scanner.nextInt();
        int w = scanner.nextInt();
        scanner.close();
        
        int sum = 0;
        for (int i = 1; i <= w; i++) {
            sum += k * i;
        }
        
        if (sum <= n) {
            System.out.println(0);
        } else {
            System.out.println(sum - n);
        }
    }
}
```

Java is more verbose than Python and requires a class and method definition to execute the code. Additionally, variable types must be declared, and a Scanner object is used for input handling. After getting the inputs, the calculation of the total cost and resultant borrowing amount, if any, is done similarly to Python. The `System.out.println` method is used for output in Java, whereas Python uses the `print` function.
