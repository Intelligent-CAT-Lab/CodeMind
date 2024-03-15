Here is the equivalent Java code for the provided Python script:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int a = scanner.nextInt();
        int s = scanner.nextInt();
        int d = scanner.nextInt();
        int f = scanner.nextInt();
        
        int x3 = d - f + s;
        int y3 = f + d - a;
        int x4 = a - f + s;
        int y4 = s + d - a;
        
        System.out.println(x3 + " " + y3 + " " + x4 + " " + y4);
        
        scanner.close();
    }
}
```

This Java code reads four integers from the user input, computes the values `x3`, `y3`, `x4`, and `y4` based on the inputs, and then prints them to the console. Don't forget to close the `Scanner` after you're done to prevent resource leaks.
