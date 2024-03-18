Here is the translated Java code:

```java
import java.util.Scanner;

public class MaxProduct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Getting the four integer inputs
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        
        // Calculating the products
        int s = a * b;
        int t = c * d;
        
        // Printing the greater product
        if (s > t) {
            System.out.println(s);
        } else {
            System.out.println(t);
        }
        
        scanner.close();
    }
}
```

To use the above Java program, simply compile and run it. When prompted, input the four integers separated by spaces like in the test input shown. The program will then output the expected result.
