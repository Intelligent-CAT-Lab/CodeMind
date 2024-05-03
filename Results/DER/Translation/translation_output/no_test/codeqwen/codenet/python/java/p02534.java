Here is the Java version of your Python code:

```java
import java.util.*;
import java.lang.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < k; i++) {
            s.append("ACL");
        }
        System.out.println(s.toString());
    }
}
```

This Java code does the same thing as your Python code. It reads an integer `k` from the standard input, then appends "ACL" to a `StringBuilder` `s` `k` times, and finally prints the contents of `s` to the standard output.
