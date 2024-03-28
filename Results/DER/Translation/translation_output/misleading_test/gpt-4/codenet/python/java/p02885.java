Here is the Java translation of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int A = input.nextInt();
        int B = input.nextInt();
        
        int diff = A - B * 2;
        if (diff < 0) {
            System.out.println(0);
        } else {
            System.out.println(diff);
        }
        
        input.close();
    }
}
```

This code will function similarly to the Python code, reading two integers as input and then calculating the difference based on the given formula. If the difference is less than 0, it prints `0`, otherwise, it prints the calculated difference.
