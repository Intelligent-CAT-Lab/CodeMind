Here's the Java equivalent of the Python code you provided:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        
        System.out.println(Math.min(A * N, B));
    }
}
```

This Java program will do the same task as the provided Python code—it reads three integers (`N`, `A`, and `B`) from standard input and then prints the minimum of `A * N` and `B`.
