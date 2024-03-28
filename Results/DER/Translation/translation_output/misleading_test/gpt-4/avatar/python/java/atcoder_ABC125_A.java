Here's the equivalent Java code for the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int T = sc.nextInt();
        int ans = (T / A) * B;
        System.out.println(ans);
        sc.close();
    }
}
```

This Java program replicates the behavior of the Python code, where it takes three integers as input and calculates the result of integer division of `T` by `A`, multiplied by `B`, and then prints the outcome. The `Scanner` class is used for input operations in Java which is similar to `input().split()` in Python.
