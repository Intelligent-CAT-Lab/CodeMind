Below is the translated code from Python to Java, which takes two integer inputs separated by space and then calculates `(a-1)*(b-1)`:

```java
import java.util.Scanner;

public class CalculateProduct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        
        System.out.println((a - 1) * (b - 1));
        
        scanner.close();
    }
}
```

Make sure you have proper exception handling if you are going to use it in a production environment, as this code assumes that the input will be two integers separated by space.
