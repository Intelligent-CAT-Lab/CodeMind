Here's the Python code translated into Java:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();

        System.out.println(A + B);
    }
}
```

To run this, you can compile and execute the `Main` class. When providing the test input as `5 8`, the expected output would be `13` (not `105` as mentioned in your test case, because the python code you provided adds the two numbers, not multiplies them). 

However, if your Python code was mistakenly adding instead of multiplying, and you intend to multiply `A` and `B` as the expected output suggests, here is the Java code for multiplication:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();

        System.out.println(A * B);
    }
}
```

Again, if you use the test input of `5 8`, the expected output will be `40`.
