Here's the equivalent Java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String[] inputs = scanner.nextLine().split(" ");
        int a = Integer.parseInt(inputs[0]);
        int b = Integer.parseInt(inputs[1]);
        
        double c = (a + b) / 2.0;
        int d = (int) c;
        
        if (c - d > 0) {
            System.out.println(d + 1);
        } else {
            System.out.println(d);
        }
        
        scanner.close();
    }
}
```

This Java code will produce the same output for the input provided. The code takes two integers as input, calculates the average, and then prints out the next integer if the average is not already an integer, otherwise it prints the integer part of the average.
