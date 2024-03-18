Certainly! Below is the equivalent Java code that achieves the same functionality:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        System.out.println((a - 1) * (b - 1));
        input.close();
    }
}
```

When you run this code with the input `2 2`, the output will be `1`, just as in the Python code.
