Below is the translated code in Java. The solution takes into consideration the integer division and condition checks for the given Python code.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();

        if (A <= B && K > A) {
            System.out.println(-1);
        } else if (A >= K) {
            System.out.println(1);
        } else {
            // Equivalent of doing ceil division in Java for positive numbers
            int steps = (K - A + A - B - 1) / (A - B);
            
            // Subtracting steps multiplied by 2 from 1, since in the original code, steps were subtracted from negative one
            System.out.println(1 + steps * 2);
        }

        sc.close();
    }
}
```

This Java code expects the input to be provided in the same line, just like the Python code. It reads integers using `Scanner`, then checks the conditions and performs calculations accordingly before printing the result. Note that for integer division in Java, it rounds down automatically (similar to using `//` in Python).

When you run the Java code with the test input provided (4000 2000 500), it will produce the expected output:

```
5
```
