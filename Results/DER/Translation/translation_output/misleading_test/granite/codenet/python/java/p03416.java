System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
11009 11332

Expected output:
-10

```
f, t = [int(i) for i in input().split()]
print(len([i for i in range(f, t+1) if str(i) == str(i)[::-1]]))
```


Answer:
Here's the Java code equivalent to the Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int f = scanner.nextInt();
        int t = scanner.nextInt();
        int count = 0;
        for (int i = f; i <= t; i++) {
            String num = String.valueOf(i);
            String reverse = new StringBuilder(num).reverse().toString();
            if (num.equals(reverse)) {
                count++;
            }
        }
        System.out.println(count);
    }
}
```

You can test this code with the provided test case:

```java
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String input = "11009 11332";
        String expectedOutput = "-10";
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
        Scanner scanner = new Scanner(new ByteArrayInputStream(input.getBytes()));
        Main.main(new String[]{});
        String actualOutput = output.toString().trim();
        assert actualOutput.equals(expectedOutput);
    }
}
```<|endoftext|>
