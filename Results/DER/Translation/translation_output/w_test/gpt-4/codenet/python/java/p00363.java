Below is the translated Java code that produces the same output as the Python code provided:

```java
import java.util.Scanner;

public class BoxPrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputs = scanner.nextLine().split(" ");
        int w = Integer.parseInt(inputs[0]);
        int h = Integer.parseInt(inputs[1]);
        String c = inputs[2];

        System.out.println("+" + "-".repeat(w - 2) + "+");
        for (int i = 0; i < h - 2; i++) {
            if (i * 2 == h - 3) {
                System.out.println("|" + ".".repeat((w - 3) / 2) + c + ".".repeat((w - 3) / 2) + "|");
            } else {
                System.out.println("|" + ".".repeat(w - 2) + "|");
            }
        }
        System.out.println("+" + "-".repeat(w - 2) + "+");
        scanner.close();
    }
}
```

In the Java code above, we use `String.repeat(int count)` to repeat strings, which is available in Java 11 and later. If you're using an older version of Java, you might not have access to this method. In such case, you would have to replace it with a loop to repeat the characters.

Here is how you could execute this Java code with the sample input provided (3 3 B):

1. Compile the Java code: `javac BoxPrinter.java`
2. Execute the compiled class with the sample input: `echo "3 3 B" | java BoxPrinter`

And you would get the expected output:

```
+-+
|B|
+-+
```
