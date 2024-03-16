Here is the equivalent Java code to perform the same operation as the provided Python code:

```java
import java.util.Scanner;

public class SumOfColors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int r = scanner.nextInt();
        int b = scanner.nextInt();
        int w = scanner.nextInt();
        int g = scanner.nextInt();
        
        int sum = r + b + w + g;
        
        System.out.println(sum);
    }
}
```

This Java code snippet creates a `Scanner` object to get input from the user, reads four integer values, which represent the variables `r`, `b`, `w`, and `g`, and finally it calculates their sum and prints it out to the console.
