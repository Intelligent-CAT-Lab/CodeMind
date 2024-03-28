Here is the equivalent Java code for the given Python script:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int a = input.nextInt();
        int b = input.nextInt();
        double c = (a + b) / 2.0;
        int d = (int)c;
        
        if (c - d > 0) {
            System.out.println(d + 1);
        } else {
            System.out.println(d);
        }
        
        input.close();
    }
}
```

This Java code reads two integers from the standard input, computes their average, and then prints either the incremented integer part of the average if there's any decimal part, or the integer part as is if the average is already an integer.
