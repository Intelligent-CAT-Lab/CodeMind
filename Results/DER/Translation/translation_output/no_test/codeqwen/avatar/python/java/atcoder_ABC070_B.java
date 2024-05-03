Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        int c = Integer.parseInt(input[2]);
        int d = Integer.parseInt(input[3]);
        System.out.println(Math.max(0, Math.min(b, d) - Math.max(a, c)));
    }
}
```

This Java code does the same thing as your Python code. It reads four integers from the user, computes the maximum of the minimum of the second and fourth integers and the maximum of the first and third integers, and then subtracts the result from zero. The result is then printed to the console.
