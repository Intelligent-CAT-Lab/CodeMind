Here is the translated Java code that carries out the same functionality as the provided Python script:

```java
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = reader.readLine().split(" ");

        int a = Integer.parseInt(inputs[0]);
        int b = Integer.parseInt(inputs[1]);
        int x = Integer.parseInt(inputs[2]);

        int d = a - b;
        int n = Math.max(0, (x - b) / d);
        long ans = (long)x + (long)n * b;

        System.out.println(ans % 1000000007);
    }
}
```

This Java code reads from the standard input, parses integers, computes the desired values, and prints the result.

To run a test input with the Java class, you can save the class as `Main.java`, then compile and run it:

```
$ javac Main.java
$ echo "3 1 5" | java Main
```

And the expected output would be:
```
7
```
