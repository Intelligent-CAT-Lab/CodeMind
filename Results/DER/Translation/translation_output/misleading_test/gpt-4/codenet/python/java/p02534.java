Here's the translated Java code that performs the same function as the provided Python code:

```java
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < k; i++) {
            sb.append("ACL");
        }
        
        System.out.println(sb.toString());
        sc.close();
    }
}
```

The Java program expects an integer `k` as input from `System.in` (standard input) and prints the string "ACL" repeated `k` times, just like the provided Python code does. Java uses a `StringBuilder` to build the string efficiently. Note that this code should be executed in an environment that supports standard input and output, and for a typical test case, you can manually input the value of `k` or redirect input from a file or other source.
