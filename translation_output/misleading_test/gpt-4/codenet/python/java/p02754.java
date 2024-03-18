Below is the equivalent Java code for the provided Python script. It reads three integers `n`, `a`, and `b` from standard input, performs the calculations, and prints out the result.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Reading input values
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        
        // Calculate the value of k and p as per the python script
        int k = n / (a + b);
        int p = n % (a + b);
        
        // Calculate and print the result
        System.out.println(k * a + Math.min(p, a));
        
        scanner.close();
    }
}
```

For the given test input `8 3 4`, the expected output when this Java program is executed will be `32`.
