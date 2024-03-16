Below is the translated code from Python to Java. This Java code takes two integers as input, separated by a space, and prints out the result of the computation as given in the Python example.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        scanner.close();

        System.out.println(N - (K - 1));
    }
}
```

When the input provided is "3 2", the expected output would be:

```
2
```

You can compile and run the above Java program by creating a file named `Main.java`, compiling it with `javac Main.java`, and running it with `java Main`. When prompted, you should enter your test input (e.g. "3 2"), and you will receive the expected output.
