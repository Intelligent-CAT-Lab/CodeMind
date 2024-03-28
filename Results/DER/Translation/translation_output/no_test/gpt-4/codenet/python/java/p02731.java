Below is the Java equivalent of the given Python code. The Java code takes an integer input from the user, calculates the value of `hen` by dividing the input by 3, and then prints the cube of `hen`.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int L = scanner.nextInt();
        double hen = L / 3.0;
        System.out.println(Math.pow(hen, 3));
        scanner.close();
    }
}
```

When you run this Java program, it will perform the same operation as the provided Python code—reading an integer input from the user, computing the cubic value of one-third of this integer, and printing the result to the console. Note that in Java, `System.in` is used to take input from the user, and `System.out` is used to print output to the console. Additionally, `Math.pow(hen, 3)` is used to raise `hen` to the power of 3, which is equivalent to `hen**3` in Python.
