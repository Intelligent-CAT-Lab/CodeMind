Here's the equivalent Java code for the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int count = 1;
        
        while (count <= N) {
            count *= 2;
        }
        
        System.out.println(count / 2);
        scanner.close();
    }
}
``` 

This Java code snippet does the same thing as the provided Python code; it reads an integer from the standard input, doubles `count` until it is greater than `N`, and then prints `count` divided by 2 (since it's an integer division, it will effectively round down to the nearest whole number, similar to `round(count/2)` in Python when `count` is an even number).
